package org.example.NumbersExam.medianMergedArray;

import java.util.Arrays;

public class Solution {


    public static void main(String[] args) {

       int [] nums1 = {1,3}, nums2 = {2};

        double medianResult = findMedianSortedArrays(nums1, nums2);
        System.out.println(medianResult);

    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int m=nums1.length;
        int n=nums2.length;
        int med1=0;
        int med2=0;
        int index1=0;
        int index2=0;

        for (int i=0;i<=(m+n)/2;i++){
            med1=med2;
            if (index1==m){
                med2=nums2[index2];
                index2++;
            }else if(index2==n){
                med2 = nums1[index1];
                index1++;
            }else if(nums1[index1] < nums2[index2]){
                med2 = nums1[index1];
                index1++;
            }else{
                med2 = nums2[index2];
                index2++;
            }
        }

        if ((m+n)%2 == 0) {
            return (float)(med1+med2)/2;
        }

        return med2;
    }
}

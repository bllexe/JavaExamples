package org.example.advanced.subarray;

public class Contiguous {

    /*contiguous sub-array(containing at least one number) which has the maximum sum and return its sum.*/

    public static void main(String[] args) {

        int n=5;
        int [] numArr={1,2,3,-2,5};
        System.out.println(maxSubarraySum(numArr,n));

    }
    static long maxSubarraySum(int arr[], int n){

        int sum=0;
        int maxNumber=arr[0];
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            maxNumber=Math.max(maxNumber,sum);
            if(sum<0){
                sum=0;
            }
        }
        return maxNumber;
    }

}

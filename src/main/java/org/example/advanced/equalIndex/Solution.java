package org.example.advanced.equalIndex;

import java.util.ArrayList;

public class Solution {
    /*find the elements whose value is equal to that of its index value  */

    public static void main(String[] args) {
        int  a[] = {15, 2, 45, 12, 7};
        ArrayList<Integer> lis= valueEqualToIndex(a,a.length);

        for(Integer in:lis){
            System.out.println(in);
        }
    }

    public static ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            if (arr[i]==i+1){
                list.add(arr[i]);
            }
        }

        return list;
    }
}
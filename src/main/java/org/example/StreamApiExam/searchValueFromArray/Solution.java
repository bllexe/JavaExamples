package org.example.StreamApiExam.searchValueFromArray;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {

        int [] aValue={5,3,15,22,4};
        //search a value  in array is any value high and equal search value return true or return false

        System.out.println(existsHigher(aValue,10));         //true
        System.out.println(existsHigherWithStream(aValue,45));  //false
    }

    //withStream
    private static boolean existsHigherWithStream(int[] aValue, int i) {
          return Arrays.stream(aValue).anyMatch(value->value>=i);
    }

    private static boolean existsHigher(int[] arr, int n) {
        boolean status=false;
        for (int i=0;i<arr.length;i++){
            if(arr[i]>=n)
               status=true;
        }
        return status;
    }
}

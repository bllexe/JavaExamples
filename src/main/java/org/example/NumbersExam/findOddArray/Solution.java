package org.example.NumbersExam.findOddArray;

import java.util.*;

public class Solution {
    public static void main(String[] args) {

        int [] arr={1,2,1,2,3,3,4,4,5};
        int res=findOdd(arr);
        System.out.println(res);
        System.out.println(findOdd2(arr));

    }

    private static int findOdd2(int[] arr) {
        Map<Integer,Integer> uniqMap=new HashMap<>();
        for(int num :arr){
                if (!uniqMap.containsKey(num)){
                    uniqMap.put(num,1);
                }
                else{
                    uniqMap.put(num,uniqMap.get(num)+1);
                 }
        }
        for (int num:uniqMap.keySet()){
            if (uniqMap.get(num) % 2==1){
                return num;
            }
        }

        return -1;
    }

    public static int findOdd(int[] arr) {

        for(int i=0;i<arr.length;i++){
            int count =0;
            for(int j=0;j<arr.length;j++){
                if (arr[i]==arr[j]){
                    count++;
                }
            }
            if (count % 2 !=0)
                return arr[i];
        }

        return -1;
    }


}

package org.example.arrayValues;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int [] numbers={1,5,6,170,8,9};
        String answer=sevenBoom(numbers);
        System.out.println(answer);

    }

    private static String sevenBoom(int[] arr) {

        for(int i=0;i<arr.length;i++){
            String str=Integer.toString(arr[i]);
            if (str.contains("7")){
                return "Boom!";
            }
        }
        return "there is no 7 in the array";
    }
}

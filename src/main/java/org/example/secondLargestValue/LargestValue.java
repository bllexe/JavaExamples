package org.example.secondLargestValue;

import java.util.Arrays;

public class LargestValue {

    public static void main(String[] args) {
        int [] numbers={2,4,5,6,7,8,9};

     /*   Arrays.sort(numbers);
        System.out.println("largest second values=>" + numbers[numbers.length-2]);//largest second values=>8*/

        System.out.println(largestSecondValue(numbers));//8

    }

    private static int largestSecondValue(int[] numbers) {
        // int highest=Integer.MIN_VALUE;
        // int secondHighest=Integer.MIN_VALUE;

        int highest=0;
        int secondHighest=0;

        for (int i : numbers){
            if (i>highest){
                secondHighest=highest;
                highest=i;
            }else if(i>secondHighest){
                secondHighest=i;
            }
        }
        return secondHighest;
    }
}

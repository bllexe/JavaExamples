package org.example.NumbersExam.minMaxValue;

import java.util.Arrays;

public class Diffrence {

    public static void main(String[] args) {
        int [] num={2,3,4,5,6,7,9};
        int [] num2={2,3,4,5,6,7,9};

        int diff=  difference(num);
        int diff2=  difference(num);

        System.out.println(diff);
        System.out.println(diff2);
    }


    public static int difference(int[] nums) {

        //streamApi
        int min=Arrays.stream(nums).min().getAsInt();
        int max=Arrays.stream(nums).max().getAsInt();
        return max-min;

    }

    public static int difference2(int[] nums) {
        int min=nums[0];
        int max =nums[0];
        for (int i =0;i<nums.length;i++){
            if (nums[i]<min){
                min=nums[i];
            }else if(nums[i]<max){
                max=nums[i];
            }
        }

        return max-min;
    }
}

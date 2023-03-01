package org.example.NumbersExam.indicesOfThetwoNumbers;


import java.util.HashMap;
import java.util.Map;

public class Main {


    public static void main(String[] args) {

        int [] nums ={2,3,5,6,8};

        int[] values = twoSum(nums, 11);

        System.out.println(values[0]);
        System.out.println(values[1]);

    }

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> numList=new HashMap<>();
        int result[]=new int[2];

        for(int i=0;i<nums.length;i++){
            if (numList.containsKey(target-nums[i])){

                result[0]=numList.get(target-nums[i]);
                result[1]=i;
                return  result;
            }
        numList.put(nums[i],i);

        }
        return result;
    }
}

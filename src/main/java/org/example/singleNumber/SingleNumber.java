package org.example.singleNumber;

public class SingleNumber {

    //Given  array of integers nums, every element appears twice except for one.

    public int singleNumber(int[] nums) {
        int numOne = nums[0];
        for (int i = 1; i < nums.length; i++) numOne ^= nums[i];
        return numOne;
    }
}
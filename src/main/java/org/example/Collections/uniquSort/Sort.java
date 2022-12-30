package org.example.Collections.uniquSort;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Sort {

    public static void main(String[] args) {

        int[] nums = {1, 4, 5, 3, 5, 3, 5, 7, 8, 9};
        uniqueSort(nums);

    }

    private static void uniqueSort(int[] nums) {
        Arrays.asList(nums);
        Arrays.sort(nums);

        HashSet<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }
        System.out.println(set); //[1, 3, 4, 5, 7, 8, 9]

    }

}
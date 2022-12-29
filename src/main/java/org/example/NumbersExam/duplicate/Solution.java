package org.example.NumbersExam.duplicate;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution {

    public static void main(String[] args) {
        //Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

        int aLength;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Array length:");

        aLength=scan.nextInt();
        int num[]=new int[aLength];
        System.out.println("Enter Array values");
        for (int i=0;i<aLength;i++){
            num[i]=scan.nextInt();
        }
        System.out.println("Duplicate Array Status-->" + containsDuplicate(num));
    }

    private static boolean containsDuplicate(int[] num) {
        Set<Integer> uniq=new HashSet<>();
        for(int i=0;i<num.length;i++){
            if (uniq.contains(num[i])) {
                return true;
            }
            uniq.add(num[i]);
        }
        return false;
    }
}

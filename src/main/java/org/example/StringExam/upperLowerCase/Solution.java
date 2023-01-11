package org.example.StringExam.upperLowerCase;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        System.out.println("enter some string");
        Scanner scn=new Scanner(System.in);
        String str=scn.nextLine();
        boolean status=sameCase(str);
        System.out.println(status);
    }

    private static boolean sameCase(String str) {

        boolean isUpper =true;
        boolean isLower=true;

        for (int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if (!Character.isUpperCase(i))
                isUpper=false;
            if (!Character.isLowerCase(i))
                isLower=false;
        }
        return  isUpper || isLower;
    }
}

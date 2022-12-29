package org.example.StringExam.palindrome;

public class Solution {

    public static void main(String[] args) {

        String str="kabak",reverseStr="";

        for(int i=(str.length()-1);i>0;--i){
            reverseStr+=str.charAt(i);
        }

        if (str.toLowerCase().equals(reverseStr.toLowerCase())){
            System.out.println(str + " is a polindrome");
        }else
            System.out.println(str + " is not a polindrome");

    }
}

package org.example.reverseString;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {

        System.out.println("Enter a string for reverse: ");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(reverse(str));
        System.out.println(reverseStr(str)); //return reverse string
    }


    private static boolean reverse(String name) {
        StringBuilder sBuilder=new StringBuilder();
        if (name==null){
            throw new IllegalArgumentException("string is not be empty");
        }
        char [] chars=name.toCharArray();
        for(int i=chars.length-1;i>=0;i--)
            sBuilder.append(chars[i]);
        if (name.equals(sBuilder.toString())){
            return true;
        }
        return false;
    }



    private static String reverseStr(String name){
        if (name==null){
            throw new IllegalArgumentException("String can not be empty");
        }
        String reverse="";
        for (int i=name.length()-1;i>=0;i--){
            reverse+=name.charAt(i);
        }
        return reverse;
    }


}

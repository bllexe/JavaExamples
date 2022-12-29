package org.example.StringExam.vowel;

import java.util.Scanner;

public class VowelCheck {

    public static void main(String[] args) {
        System.out.println("Enter A String->");
        Scanner scn=new Scanner(System.in);
        String str=scn.nextLine();
        System.out.println(hasVowel(str));
    }

    private static boolean hasVowel(String str) {
        return str.toLowerCase().matches(".*[aeiou].*");
    }
}

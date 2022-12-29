package org.example.StringExam.shuffleArray;

import java.util.Random;

public class ShuffleStringChar {
    public static void main(String[] args) {

        String str="adffd fdsad";
        System.out.println(nameShuffle(str));
        System.out.println(nameShuffle2(str));
    }

    private static String nameShuffle(String s) {

        int space=s.indexOf(" ");
        String name=s.substring(0,space);
        String surname=s.substring(space+1);
        return surname + " " + name;
    }

    private static  String nameShuffle2(String s){
        String [] parts=s.split(" ");
        String name=parts[0];
        String surnanme=parts[1];
        return surnanme + " "+ name;
    }

}

package org.example.StreamApiExam;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {

        int [] arr={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

        //avarage()
        System.out.print("Avarage of Array =>");
        System.out.println(Arrays.stream(arr).average().getAsDouble());//ptionalDouble[10.5]
        //findAny()
        System.out.print("searching any values =>");
        System.out.println(Arrays.stream(arr).findAny().getAsInt()); //OptionalInt[1]
        //findFirst()
        System.out.print("first value of arrays =>");
        System.out.println(Arrays.stream(arr).findFirst().getAsInt()); //OptionalInt[1]
        //max()
        System.out.print("max value from arrays =>");
        System.out.println(Arrays.stream(arr).max().getAsInt());  //OptionalInt[20]
        //min()
        System.out.print("min value from arrays =>");
        System.out.println(Arrays.stream(arr).min().getAsInt());  //OptionalInt[1]
    }
}

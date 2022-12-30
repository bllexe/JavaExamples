package org.example.StreamApiExam;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int [] arr={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

          int sum = 0;
        sum = Arrays.stream(arr).sum();
        System.out.println("average with stream api=>" + sum / arr.length); //10


       Arrays.stream(arr)
                .asDoubleStream().forEach(e-> System.out.print(e+" "));
        //1.0 2.0 3.0 4.0 5.0 6.0 7.0 8.0 9.0 10.0 11.0 12.0 13.0 14.0 15.0 16.0 17.0 18.0 19.0 20.0

        Arrays.stream(arr)
                .asLongStream().forEach(e-> System.out.print(e + " "));
        //1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20

        //devide 11
        System.out.print(Arrays.stream(arr).anyMatch(e->e % 11 ==0)); //true

        System.out.print(Arrays.stream(arr).allMatch(e->e % 2==0));  //false

        System.out.print(Arrays.stream(arr).noneMatch(e->e>=21));  //true
    }
}

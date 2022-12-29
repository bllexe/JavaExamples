package org.example.NumbersExam.factorial;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        System.out.println("Enter a number for factorial->");
        Scanner scan=new Scanner(System.in);
        int number=scan.nextInt();
        System.out.println("Factorial =>" + calculateFactorial(number));

    }

    private static long calculateFactorial(int number) {
        if (number==1)
             return 1;
        return (number*calculateFactorial(number-1));
    }

}

package org.example.NumbersExam.primeNumber;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        System.out.println("Enter a number for checking prime ->");
        Scanner scn=new Scanner(System.in);
        int number=scn.nextInt();
        System.out.println(checkPrime(number));
    }

    private static String checkPrime(int number) {
        if (number==0 || number==1)
            return "number that you give is not prime";
        if (number==2)
            return "number  that you give is a prime";

        for (int i=2;i<=number/2;i++){
            if (number % i ==0){
                return "number that you give is not a prime";
            }
        }
        return "number that you give is a prime";
    }
}

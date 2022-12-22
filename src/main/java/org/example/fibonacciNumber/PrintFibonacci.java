package org.example.fibonacciNumber;

import java.util.Scanner;

public class PrintFibonacci {

    public static void main(String[] args) {
        System.out.println("Shows the Fibonacci numbers up to the given number->");
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        printFibonacciNumber(num);
    }

    private static void printFibonacciNumber(int num) {
        int a=0;
        int b=1;
        int c=1;
        for(int i=1;i<=num;i++){
            System.out.print(a + ", ");
            a=b;
            b=c;
            c=a+b;

        }
    }
}

package org.example.NumbersExam.reverseNumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter Number:");
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        ReverseNumber rNumber=new ReverseNumber();
        System.out.println("Reverse of number U enter-->" + rNumber.reverse(num));
    }
}

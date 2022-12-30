package org.example.NumbersExam.primeNumber;

import java.util.Scanner;

public class HowManyPrime {

    public static void main(String[] args) {

        System.out.println("Enter a Number");
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        int howMany=primeNumbers(num);
        System.out.println("prime number count =>" + howMany);
    }

    private static int primeNumbers(int num) {
        int count=0;
        if (num<=1)
            return 0;
        for(int i=0;i<num;i++){
            int g=2;
            for(;g<i;g++){
                if(i % g==0)
                    break;
            }
            if (i==g){
                count++;
            }
        }
        return count;
    }
}

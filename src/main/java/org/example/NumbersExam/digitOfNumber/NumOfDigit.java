package org.example.NumbersExam.digitOfNumber;

public class NumOfDigit {

    public static void main(String[] args) {

        System.out.println(numOfDigits(1000)); //4

    }

    public static int numOfDigits(int num) {

        int count=1;
        while (num>=10){
            num=num/10;
            count++;
        }
        return count;
    }
}

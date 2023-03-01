package org.example.bit.leftShift;

public class Main {

    public static void main(String[] args) {
        System.out.println( shiftToLeft(12,4));
    }


    public static int shiftToLeft(int a,int b){

        double shiftNumber=Math.pow(2,b);

        return (int)(shiftNumber*a);
    }
}

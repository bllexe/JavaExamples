package org.example.bit.subtract;

public class Main {

    public static void main(String[] args) {

        /*subtracts one positive integer from another, without using any arithmetic operators such as -, %, /, + */
        //Use bitwise operations

        System.out.println(mySub(5,9));
    }

    public static int mySub(int a,int b){

        while (b !=0){
            int borrow=(~a) & b;
            a=a^b;
            b=borrow<<1;
        }
        return a;

    }
}

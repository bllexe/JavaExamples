package org.example.bit.rightShift;

import static java.lang.Math.floor;

public class Main {

    public static void main(String[] args) {

        /*Sample calculation using the right shift operator ( >> )*/

        int x=-512,y=10;
        System.out.println(shiftToRight(x,y));

    }

    public static int shiftToRight(int x ,int y){

        double shiftNumber=Math.pow(2,y);

        return (int) floor((x/shiftNumber));
    }
}

package org.example.bit.reverseBit;

public class Main {

    public static void main(String[] args) {

        /*reverses the binary representation of that integer, and returns the new integer from the reversed binary.*/

        int [] numberOfTest={10,12,25,45};
        for (int i=0;i<numberOfTest.length;i++){
            System.out.println(reservedBinaryInteger(numberOfTest[i]));
        }

    }

    public static int reservedBinaryInteger(int i) {

        StringBuilder stringBuilder=new StringBuilder();

        if (i<0)
            new Throwable("number must be grather than 0");

        System.out.println("Number of Testing=>" + i);
        String binaryNumber=Integer.toBinaryString(i);
        System.out.println("before reverse=>" + binaryNumber);
        stringBuilder.append(binaryNumber);
        stringBuilder.reverse().toString();

        System.out.println("after reverse=>"+stringBuilder);

        return Integer.parseInt(stringBuilder.toString(),2);
    }

}

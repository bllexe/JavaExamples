package org.example.advanced.binaryRepresentation;

public class Solution {

    public static void main(String[] args) {
        // Binary representation of a given number N.
        int n=2;
        System.out.println(getBinary(n));
    }

    public static String getBinary(int num){
        String binary=Integer.toBinaryString(num);
        if(num<0)
            return binary.substring(2);
        else {
            if (binary.length()==30){
                return binary;
            }
            else{
                return "0".repeat(Math.max(0,30-binary.length()))+binary;
            }
        }
    }
}

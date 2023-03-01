package org.example.bit.evenOrOdd;

public class Main {

    public static void main(String[] args) {

        System.out.println(checkStatus(11));
    }

    public static String checkStatus(int number){
        if ((number^1)==(number+1))
            return "even";
        return "odd";

    }
}

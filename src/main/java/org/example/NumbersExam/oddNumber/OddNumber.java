package org.example.NumbersExam.oddNumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OddNumber {

    public static void main(String[] args) {

        int [] numArray={2,1,4,5,6,7,8,9};
        System.out.println(checkOdd(numArray));
    }

    private static boolean checkOdd(int[] numArray) {
        for(int i : numArray){
            if(i % 2==0)
                return false;
        }
        return true;

        //Arrays.stream(numArray).anyMatch(x->x % 2 != 0);

    }


}

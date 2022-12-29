package org.example.NumbersExam.sumofArray;

import java.util.Arrays;

public class SumArrayValue {

    public static void main(String[] args) {

        int [] aNumber={1,2,3,4,5,6,7,8,9};
        int sum=0;

        for (int i : aNumber){
            sum+=i;
        }
        System.out.println(sum);
        //45

        //stream
        System.out.println(Arrays.stream(aNumber).sum()); //45


    }

}

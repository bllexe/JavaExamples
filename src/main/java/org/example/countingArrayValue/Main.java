package org.example.countingArrayValue;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        boolean [] countTrue={true,false,true,false,true};//3

        System.out.println(CountTrue(countTrue));
        System.out.println(CountTrueStream(countTrue));
    }

    private static int CountTrue(boolean[] countTrue) {
        int count =0;
        for(boolean value :countTrue){
           if (value==true)
               count+=1;
           }
             return count;
    }

    //with stream
    private static int CountTrueStream(boolean[] countTrue) {
        Stream<Boolean> stream= IntStream.range(0,countTrue.length)
                .mapToObj(x->countTrue[x]);
        return (int) stream.filter(s->s.equals(true)).count();

    }

}

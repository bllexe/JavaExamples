package org.example.StringExam.stringValue;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SameStringValue {

    public static void main(String[] args) {

        String [] words={"user","user","user","user"};
        System.out.println(testJackpot(words));
        System.out.println(testJackpot2(words));
    }

    public static boolean testJackpot(String[] result) {

        Set<String> str=new HashSet<>(Arrays.asList(result));
        return (str.size()==1);
    }

    public static boolean testJackpot2(String[] result) {

        String first=result[0];
        for (int i=1;i<result.length;i++){
            if (result[i] !=first){
                return false;
            }
        }
        return true;
    }
}


package org.example.NumbersExam.arrayValues;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SameElements {
    public static void main(String[] args) {
        Integer[] array1={1,2,3,1,2};
        Integer[] array2={1,2,3};
        Integer[] array3={1,2,3,4};

        System.out.println(sameElement(array1,array2));
        System.out.println(sameElement(array1,array3));
    }

    private static boolean sameElement(Object[] array1, Object[] array2) {

        Set<Object> a1=new HashSet<>(Arrays.asList(array1));
        Set<Object> a2=new HashSet<>(Arrays.asList(array2));

        if (a1.size() != a2.size())
            return false;

        for (Object obj: a1){
            if (!a2.contains(obj))
                return false;
        }
        return true;

    }
}

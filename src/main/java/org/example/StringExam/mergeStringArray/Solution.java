package org.example.StringExam.mergeStringArray;

import java.util.Arrays;
import java.util.List;

public class Solution {

    public static void main(String[] args) {

        String name[] ={"java","python","JavaScript","ShellScript"};
        String pLanguge[]={"C#","Ruby","NodeJs"};

        String [] mergeLanguage=mergeStringArrays(name,pLanguge);

        for(String s:mergeLanguage){
            System.out.println(s);
        }
    }


    private static String[] mergeStringArrays(String array1[], String array2[]) {

        if (array1.length==0 || array1==null) return array2;
        if (array2.length==0 || array2==null) return array1;

        int len=array1.length+array2.length;
        String [] result=new String[len];

        System.arraycopy(array1, 0, result, 0, array1.length);
        System.arraycopy(array2, 0, result, array1.length, array2.length);

        return new String[]{Arrays.toString(result)}; //[java, python, JavaScript, ShellScript, C#, Ruby, NodeJs]

    }
}

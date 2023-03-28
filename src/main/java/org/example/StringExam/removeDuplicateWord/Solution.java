package org.example.StringExam.removeDuplicateWord;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Solution {

    public static void main(String[] args) {
        /*Remove Duplicate Words from String*/

        String senteces="Bu bir deneme dizisidir. Bu ayni zamanda ayni zamanda sonradan eklendi";
        System.out.println("orginal String => " + senteces);

        String result=  removeDuplicateWord(senteces);

        System.out.println("After remove duplicate words");
        System.out.println(result);

    }

    private static String removeDuplicateWord(String senteces) {

        String[] word = senteces.split("\\s+");

        Set<String> monoWord=new LinkedHashSet<String>(Arrays.asList(word));

        StringBuilder sb=new StringBuilder();
        int index=0;

        for(String s: monoWord){
            if(index>0){
                sb.append(" ");
            }
            sb.append(s);
            index++;
        }
        String result = sb.toString();
        return result;
    }
}

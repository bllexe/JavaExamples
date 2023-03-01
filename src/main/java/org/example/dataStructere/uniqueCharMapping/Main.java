package org.example.dataStructere.uniqueCharMapping;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        String name="banana";
        Map<Character,Integer> charMapping=characterMapping(name);

        System.out.println(charMapping);
    }
    public static Map<Character, Integer> characterMapping(String str) {

        Map<Character,Integer> countOfStr=new HashMap();
        for (int i=0;i<str.length();i++){
            char currentChar=str.charAt(i);
            if (countOfStr.containsKey(currentChar)){
                countOfStr.put(currentChar,countOfStr.get(currentChar)+1);
            }else
                countOfStr.put(currentChar,i);
        }
   /*    for (Map.Entry<Character,Integer> co:countOfStr.entrySet()){
           System.out.print(co.getKey()+":");
           System.out.print(co.getValue() + " ");
       }*/

        return countOfStr;
    }
}

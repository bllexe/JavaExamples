package org.example.countValueFromString;

import java.util.HashMap;
import java.util.Map;

public class CountChar {

    public static void main(String[] args) {
        String s1="AAaabbccCDdEEEe";
        char[] chars=s1.toCharArray();

        Map<Character,Integer> charsCount=new HashMap<>();
        for (char c : chars){
            if (charsCount.containsKey(c)){
                charsCount.put(c,charsCount.get(c)+1);
            }else
                charsCount.put(c,1);
        }

        System.out.println(charsCount);//{A=2, a=2, b=2, c=2, C=1, D=1, d=1, E=3, e=1}
    }

}

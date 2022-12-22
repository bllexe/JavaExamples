package org.example.encode_decode;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {

         String name="bila";
         List<String> names = new ArrayList<>();
         names.add("apple");
         names.add("banana");
         names.add("Straberry");

        System.out.println(encode(names));//apple-5banana-6Straberry-9

        //  System.out.println(decode(name));

    }

    public static List<String> decode(String str){
        List<String> list = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '#') j++;

            int length = Integer.valueOf(str.substring(i, j));
            i = j + 1 + length;
            list.add(str.substring(j + 1, i));
        }
        return list;
    }

    public static String encode(List<String> strs){

        StringBuilder builder=new StringBuilder();
        for (String str: strs){
            builder.append(str).append("-").append(str.length());
        }
        return builder.toString();
    }

}

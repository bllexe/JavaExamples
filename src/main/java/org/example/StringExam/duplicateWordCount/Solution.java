package org.example.StringExam.duplicateWordCount;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Solution {

    public static void main(String[] args) {

        duplicateWords("Java is Java");
        // duplicateWords("Java is OOP concept language OOP");
        //duplicateWords("Best practice language is Java Language");

    }

    private static void duplicateWords(String sentences) {


        String[] words = sentences.split(" ");

        Map<String,Integer> wordCount=new HashMap<>();

        for(String word:words){
            if (wordCount.containsKey(word)){
                wordCount.put(word,wordCount.get(word)+1);
            }else{
                wordCount.put(word,1);
            }
        }

       /* for(Map.Entry entry:wordCount.entrySet()){
            System.out.println(entry.getValue() + " " + entry.getKey());

        }
        2 Java
        1 is  */

        Set<String> wordString=wordCount.keySet();
        for(String s:wordString){
            if (wordCount.get(s)>1){
                System.out.println(s +" "+ wordCount.get(s));
            }
        } //java 2

        for(String word: wordCount.keySet()){
            int count=wordCount.get(word);
            if (count>1)
                System.out.println(word + ": " + count);
        } //java 2

    }
}

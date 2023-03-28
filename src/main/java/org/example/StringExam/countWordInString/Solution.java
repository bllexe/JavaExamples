package org.example.StringExam.countWordInString;

public class Solution {

    public static void main(String[] args) {

        String word="Hello Java is best programing language learning OOP concept";

        countWordInString(word);
        countWordInString2(word);
    }

    private static void countWordInString2(String word) {
        int count=1;

        for (int i=0;i<word.length()-1;i++){
            if((word.charAt(i) ==' ') && (word.charAt(i+1) !=' ')){
                count++;
            }
        }
        System.out.println(count); //9
    }

    private static void countWordInString(String words) {

        String[] word = words.split("\\s+");

        int count=0;
        for(String wrd: word){
            count++;
        }
        System.out.println("Total word in String count->" + count); //9
    }

}

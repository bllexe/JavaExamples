package org.example.NumbersExam.countWords;

public class Main {

    public static void main(String[] args) {

        int count=countWords("Just");
        System.out.println(count);
    }

    private static int countWords(String s) {
        char [] chars=s.toCharArray();
        int count=1;
        for (char c :chars){
            if (Character.isWhitespace(c)){
                count++;
            }
        }
        return count;
    }
}

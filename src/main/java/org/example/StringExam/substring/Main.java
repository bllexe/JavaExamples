package org.example.StringExam.substring;

public class Main {
    public static void main(String[] args) {

        String s1="abc";
        String s2="bc";

       boolean che= checkEnding(s1,s2);
       boolean che2= checkEnding(s1,s2);
        System.out.println(che);
        System.out.println(che2);
    }

    private static boolean checkEnding(String s1, String s2) {

        String newString=s1.substring(s1.length()-s2.length());
        if (newString.equals(s2))
            return true;
        return false;
    }

    private static  boolean checkEnding2(String s1,String s2){
        return s1.endsWith(s2);
    }

}

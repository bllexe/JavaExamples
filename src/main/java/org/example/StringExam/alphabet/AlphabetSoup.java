package org.example.StringExam.alphabet;

import java.util.Arrays;

public class AlphabetSoup {

    public static void main(String[] args) {
        System.out.println(AlphabetSoup("configuration"));//acfgiinnoortu
        System.out.println(AlphabetSoup2("configuration"));
    }

    private static String AlphabetSoup2(String str) {

        int temp;
        char [] chrs=str.toCharArray();
        for (int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                if (chrs[i]>chrs[j]){
                  temp=chrs[i];
                  chrs[i]=chrs[j];
                  chrs[j]= (char) temp;
                }
            }
        }
         return Arrays.toString(chrs);
    }

    public static String AlphabetSoup(String s) {

         char [] chars=s.toCharArray();
         Arrays.sort(chars);
         return new String(chars);
    }
}

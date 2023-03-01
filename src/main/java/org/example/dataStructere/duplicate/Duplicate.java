package org.example.dataStructere.duplicate;

import java.util.Arrays;
import java.util.LinkedList;

public class Duplicate {

    public static void main(String[] args) {

        String info = "Java is the best programing language for learn";
        char str[] = info.toCharArray();

        int len = str.length;
        removeDuplicate(str, len);
        removeDuplicateWithSet(str, len);

    }

    private static void removeDuplicateWithSet(char[] str, int len) {

        LinkedList<Character> charSet=new LinkedList<>();
        for (int i=0;i<len;i++){
            charSet.add(str[i]);
        }
        String word="";
        for (Character ch:charSet){
            word+=ch;
        }
        System.out.println(word);
    }

    public static void removeDuplicate(char[] str,int len){
        int index=0;
        for(int i=0;i<len;i++){
             int j=0;
            for (j=0;j<len;j++){

                if (str[i]==str[j]){
                    break;
                }
            }
            if (i==j){
                str[index++]=str[i];
            }
        }
        System.out.println(String.valueOf(Arrays.copyOf(str,index)));
    }


}

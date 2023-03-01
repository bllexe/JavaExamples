package org.example.StringExam.swapfirstLastChar;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("enter some string value");
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        //  System.out.println(flipEndChars(str));
        System.out.println(flipEndChars2(str));
    }

    private static String flipEndChars(String str) {
        char [] list=str.toCharArray();
        int length=str.length();
        if (length<2)
            return "Incopatibale";
        if (list[0]==list[str.length()-1]){
            return "two is a pair";
        }
        String words="";
        char temp=list[0];
        for(int i=0;i<list.length;i++){
            list[0]=list[list.length-1];
            list[list.length-1]=temp;
            words+=list[i];
        }
        return words;
    }

    private static String flipEndChars2(String str){
        if (str.length()<2)
            return "incompatible";
        if (str.charAt(0)==str.charAt(str.length()-1)){
            return "Two is a pair";
        }
        return str.charAt(str.length()-1) + str.substring(1,str.length()-1)+str.charAt(0);
    }
}

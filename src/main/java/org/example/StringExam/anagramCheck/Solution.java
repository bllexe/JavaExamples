package org.example.StringExam.anagramCheck;

public class Solution {

    //Given two strings s and t, return true if t is an anagram of s, and false otherwise.

    public static void main(String[] args) {

        //System.out.println(isAnagram("anagram","ganaram"));//true
        //System.out.println(isAnagram("cat","doge"));  //false
        System.out.println(isAnagram("advice","device")); //false
    }

    private static boolean isAnagram(String s1, String s2) {

        if(s1.length()!=s2.length())
            return false;
        int [] store =new int[29];
        for (int i=0;i<s1.length();i++){
            store[s1.charAt(i) -'a']++;
            store[s2.charAt(i) -'a']--;
        }
        for(int n : store){
            if (n!=0){
                return false;
            }
        }
        return true;
    }
}

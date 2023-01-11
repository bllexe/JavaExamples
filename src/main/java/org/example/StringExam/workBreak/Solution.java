package org.example.StringExam.workBreak;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static void main(String[] args) {
        String s ="leetcode";
        Set<String> dict=new HashSet<>();
        dict.add("leet");
        dict.add("code");
        boolean status=wordBreak(s,dict);
        System.out.println(status);
    }

    private static boolean wordBreak(String s, Set<String> dict) {
        return wordBreakHelper(s,dict,0);
    }
    private static boolean wordBreakHelper(String s, Set<String> dict, int start) {
        if (start==s.length())
            return true;

        for(String a: dict){
            int len=a.length();
            int end=start+len;
            if (end>s.length())
                continue;
            if (s.substring(start,start+len).equals(a))
                if (wordBreakHelper(s,dict,start+len))
                    return true;
        }
        return false;
    }
}


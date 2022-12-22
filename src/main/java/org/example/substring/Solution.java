package org.example.substring;

import java.util.HashSet;

public class Solution {

    public static void main(String[] args) {

        System.out.println(lengthOfLongestSubstring("bilal"));

    }

    public  static int lengthOfLongestSubstring(String s){
        HashSet<Character> set=new HashSet<>();
        int left=0;
        int ans=0;
        for (int right=0; right <s.length();right++){
            while (set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            ans=Math.max(ans,right - left + 1);
        }
        return ans;
    }
}

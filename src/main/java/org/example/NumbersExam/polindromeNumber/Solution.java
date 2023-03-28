package org.example.NumbersExam.polindromeNumber;

public class Solution {

    public static void main(String[] args) {

        boolean palindrome = isPalindrome(121);
        System.out.println(palindrome);

    }

    public static boolean isPalindrome(int x) {

        if(x<0 || x!=0 && x%10 ==0 ) return false;
        int check=0;
        while(x>check){
            check = check*10 + x%10;
            x/=10;
        }
        return (x==check || x==check/10);

    }
}

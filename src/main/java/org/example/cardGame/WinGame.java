package org.example.cardGame;

import java.util.Arrays;

public class WinGame {

    public static void main(String[] args) {
        int [] me ={2,5,2,8,9};
        int [] opp={3,3,7,8,9};

        boolean status=compareCard(me,opp);
        System.out.println(status);
    }

    private static boolean compareCard(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        return a[4]*10+a[3]>b[4]*10+b[3];
    }
}

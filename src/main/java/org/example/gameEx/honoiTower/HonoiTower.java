package org.example.gameEx.honoiTower;

import java.util.Scanner;

public class HonoiTower {

    public static void main(String[] args) {

        System.out.println("===========returns the minimum amount of steps needed to complete the game========");
        System.out.println("Enter discs count=>");
        Scanner scn=new Scanner(System.in);
        int discCount=scn.nextInt();

        System.out.println(towerHanoi(discCount));
    }

    private static int towerHanoi(int discCount) {

        if (discCount==0){
            return 0;
        }
        return (int)Math.pow(2,discCount)-1;

    }
}

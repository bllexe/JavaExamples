package org.example.StringExam.rps;

import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {

        System.out.println("=========Rock Paper Scissors Game Choose one of them(rock,paper,scissors)===========");

        System.out.println("First Player picking => ");
        Scanner scanner=new Scanner(System.in);
        String player1=scanner.next();
        System.out.println("Second Player picking=>");
        String player2=scanner.next();

        String win=rps(player1,player2);
        System.out.println(win);

    }

    private static String rps(String player1, String player2) {

        if (player1.equals(player2))
            return "TIE";
        else if(player1.equals("rock") && player2.equals("scissors"))
            return "Player 1 wins";
        else if(player1.equals("rock") && player2.equals("paper"))
            return "Player 2 wins";
        else if(player1.equals("paper") && player2.equals("rock"))
            return  "Player 1 wins";
        else if(player1.equals("paper") && player2.equals("scissors"))
            return "Player 2 wins";
        else if (player1.equals("scissors") && player2.equals("rock"))
            return "Player 1 wins";
        else if(player1.equals("scissors") && player2.equals("paper"))
            return  "Player 1 wins";

        return null;
    }

}

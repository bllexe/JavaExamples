package org.example.gameEx.wordle;

import java.util.ArrayList;
import java.util.Random;

public class Wordle {

    private String [] words;
    private char [] wordLetters;
    private ArrayList<String> wordList;

    public Wordle(String [] words){
        this.words=words;
        wordList=new ArrayList<>();
    }

    public void shuffle(){
        Random rnd=new Random();
        for (String word:words){
            wordLetters=word.toCharArray();
            for (int i=0;i<wordLetters.length;i++){
                int randomIndex=rnd.nextInt(wordLetters.length);
                char temp=wordLetters[i];
                wordLetters[i]=wordLetters[randomIndex];
                wordLetters[randomIndex]=temp;
            }
            wordList.add(new String(wordLetters));
        }
    }
    public ArrayList<String> getWordList(){
        return wordList;
    }

    public static void main(String[] args) {

        String [] words={"wordle","bilal","yakut","java","jennifer"};
        Wordle game=new Wordle(words);
        game.shuffle();
        System.out.println(game.getWordList());
    }



}

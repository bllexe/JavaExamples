package org.example.StringExam.shuffleArray;

public class ShuffleIndex {

    public static void main(String[] args) {

        String name="users";
        System.out.println(indexShuffle(name));

    }

    public static String indexShuffle(String str) {

        char[] chr= str.toCharArray();
        String even="";
        String odd="";
        for(int i=0;i<str.length();i++){
            if (i%2!=1){
                even=even+chr[i];
            }else{
                odd=odd+chr[i];
            }
        }
        return even+odd;
    }
}



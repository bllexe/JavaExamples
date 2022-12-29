package org.example.StringExam.shuffleArray;

import java.util.Arrays;
import java.util.Random;

public class ShuffleArray {

    public static void main(String[] args) {
        Random rnd=new Random();

        int [] numbers={1,2,3,4,5,6,7,8};
        System.out.println("Before shuffle==>");

        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println(" \n After shuffle Arrays=>");
        for (int i =0;i<numbers.length;i++){
            int randomIndex=rnd.nextInt(numbers.length);
            int temp=numbers[randomIndex];
            numbers[randomIndex]=numbers[i];
            numbers[i]=temp;
        }
        System.out.println(Arrays.toString(numbers));//[4, 1, 3, 6, 5, 8, 2, 7]
    }
}

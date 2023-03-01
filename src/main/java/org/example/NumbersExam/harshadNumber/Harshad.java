package org.example.NumbersExam.harshadNumber;

public class Harshad {

    public static void main(String[] args) {

        // 7 + 5 = 12
        // 75 is not exactly divisible by 12
        System.out.println(isHarshad(75));

    }

    private static boolean isHarshad(int num) {

      int sum=0;
      int temp=num;
      while (temp>0){
          sum+=temp%10;
          temp/=10;
      }
      return num % sum==0;
    }
}

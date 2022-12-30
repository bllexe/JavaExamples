package org.example.NumbersExam.perfectNumber;

public class PerfectNumber {
    public static void main(String[] args) {


        boolean status=checkPerfect(33550336);
        System.out.println(status);
        //6,28,496

        /*	int sum = 1;
    for(int i=2; i<=num/2; i++){
      if(num%i == 0){
        sum += i;
       }
    }
		return sum==num; */

    }

    private static boolean checkPerfect(int num) {
        int sum=0;
        boolean status=false;
        for (int i=1;i<num;i++){
            if (num%i==0)
                sum+=i;
            if (sum==num){
              status =true;
            }else
              status=false;
        }
        return  status;
    }
}

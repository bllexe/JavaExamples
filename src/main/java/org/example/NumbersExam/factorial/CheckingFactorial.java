package org.example.NumbersExam.factorial;

public class CheckingFactorial {

    public static void main(String[] args) {

        boolean status=isFactorial(6);
        System.out.println(status);
    }

    private static boolean isFactorial(int n) {
/*
     for (int i=1;;i++){
          if (n%i==0){
                   n/=i;
           }else {
               break;
               }
           }
           if (n==1)
               return true;
           else
               return false;
*/

       //better
        int fact = 1;
        for (int i = 2; fact < n; i++){
            fact *= i;
        }
        return fact == n;
    }
}

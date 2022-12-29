package org.example.NumbersExam.missingNumber;

public class MissingNumber {

    public static void main(String[] args) {

        int [] arry={1,2,4,0,5,6,7};

        System.out.println("missing number of your array-->" + missingNumber(arry));

    }

    private static int missingNumber(int[] arry) {
        int sum = 0;
        int total = arry.length * (arry.length + 1) / 2;
        for (int i = 0; i < arry.length; i++) {
            sum += arry[i];
        }
        return total - sum;
    }

}

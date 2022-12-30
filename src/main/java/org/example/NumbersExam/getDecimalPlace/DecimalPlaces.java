package org.example.NumbersExam.getDecimalPlace;

public class DecimalPlaces {

    public static void main(String[] args) {

        int dec=getDecimalPlaces("43.123");
        System.out.println(dec);
    }
    private static int getDecimalPlaces(String num) {


        int dat = num.indexOf(".");
        if (dat < 0) {
            return 0;
        } else {
            int count = 0;
            char[] chars = num.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (i > dat) {
                    count++;
                }
            }
            return count;
        }
    }
}

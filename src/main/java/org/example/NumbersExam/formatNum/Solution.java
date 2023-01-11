package org.example.NumbersExam.formatNum;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

public class Solution {

    public static void main(String[] args) {

        //String res=formatNum(1000);
       // System.out.println(res);
        System.out.println(formatNumber(100000));
    }


   /* public static String formatNum(int num) {
        BigDecimal bd= new BigDecimal(num);

        DecimalFormat formatter= (DecimalFormat) NumberFormat.getInstance(Locale.US);
        DecimalFormatSymbols symbols=formatter.getDecimalFormatSymbols();

        symbols.setGroupingSeparator(',');
        formatter.setDecimalFormatSymbols(symbols);
        return  formatter.format(bd.longValue());

    }*/

    public static String formatNumber(int num) {
        DecimalFormat formatter = new DecimalFormat("#,###");
        return formatter.format(num);
    }
}

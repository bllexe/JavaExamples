package org.example.DateExam;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class HowManyDay {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
        Date date1=sdf.parse("04/21/2022");
        Date date2=sdf.parse("04/25/2022");

        long result=countDay(date1,date2);
        System.out.println(result);
    }

    private static long countDay(Date date1, Date date2) {
        long timeDiff=Math.abs(date1.getTime()-date2.getTime());
        long daysDiff=TimeUnit.DAYS.convert(timeDiff,TimeUnit.MILLISECONDS);

        return daysDiff;
    }
}

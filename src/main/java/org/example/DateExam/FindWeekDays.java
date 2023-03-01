package org.example.DateExam;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class FindWeekDays {

    public static void main(String[] args) {

        int date=17;
        int month=03;
        int year=2017;
        System.out.println(findDay(date,month,year));//FRIDAY
        System.out.println(findDays(date,month,year));//FRIDAY

    }

    private static String findDay(int day, int month, int year) {

        LocalDate localDate=LocalDate.of(year,month,day);
        return localDate.getDayOfWeek().name();

    }

    private static String findDays(int day ,int month,int year){
        Calendar c=Calendar.getInstance();
        c.set(year,month-1,day);
        Date d=c.getTime();
        SimpleDateFormat sdf=new SimpleDateFormat("EEEE");
        String dayOfWeek=sdf.format(d);
       return dayOfWeek;
    }
}

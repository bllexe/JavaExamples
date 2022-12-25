package org.example.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {

    public static void main(String[] args) {
        String dateFormat="MM-dd-yyyy";
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat(dateFormat);

        String date=simpleDateFormat.format(new Date());
        System.out.println(date);//12-25-2022
    }
}

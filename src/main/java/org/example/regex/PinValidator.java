package org.example.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PinValidator {

    public static void main(String[] args) {

        System.out.println(isValidPin("121317"));
        System.out.println(isValidPin("1234"));
        System.out.println(isValidPin("45135"));
        System.out.println(isValidPin("89abc1"));
        System.out.println(isValidPin("900876"));
        System.out.println(isValidPin(" 4983"));

    }

    public static boolean isValidPin(String pin){
        String pattern="^[0-9]{4}$|^[0-9]{6}$";
        Pattern p=Pattern.compile(pattern);
        Matcher m=p.matcher(pin);
        return m.matches();
    }

}

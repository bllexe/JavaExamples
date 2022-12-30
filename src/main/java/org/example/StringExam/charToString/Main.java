package org.example.StringExam.charToString;

public class Main {

    //If "A" immediately follows a digit, add 1 to the digit.
    //If "B" immediately follows a digit, subtract 1 from the digit.
    public static void main(String[] args) {

        String str="3A78B51"; //4A77B51
        String str2="9999B"; //9998B
        String str3="567"; //567
        String result=afterPosition(str3);
        System.out.print(result);

    }

    private static String afterPosition(String str) {

        String result = "";
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'A') {
                chars[i - 1] += 1;
            } else if (chars[i] == 'B') {
                chars[i - 1] -= 1;
            }
        }
        for(char c :chars){
            result+=c;
        }
        return result;
    }
}

package org.example.StringExam.phoneFormat;

public class FormatPhoneNumber {

    public static void main(String[] args) {

        int[] formatString = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String formatCode = formatPhoneNumber(formatString);
        System.out.println(formatCode);

        //shortway
   /*    String str= String.format("(%d%d%d) %d%d%d-%d%d%d%d", formatString[0], formatString[1], formatString[2], formatString[3],
                formatString[4], formatString[5], formatString[6], formatString[7], formatString[8], formatString[9]);

        System.out.println(str);*/
    }

    private static String formatPhoneNumber(int[] nums) {

        String phoneNumber = "(" + getNumbers(nums, 0, 2) + ")" + " " + getNumbers(nums, 3, 5) + "-" + getNumbers(nums, 6, nums.length - 1);
        return phoneNumber;
    }


    public static String getNumbers(int[] arr, int start, int end) {
        String number = "";
        for (int i = start; i <= end; i++) {
            if (("" + arr[i]).length() >= 2) {
                System.out.println("Let all the numbers be of single digit (Number at position " + i + ").");
                System.exit(1);
            }
            number = number + arr[i];
        }
        return number;
    }


}

package org.example.StringExam.countValueFromString;

public class MaxCharCount {

    public static void main(String[] args) {

        String values="Bir zamanlar fakir ama gururlu bir genc vardi simdi o genci buyudu koca adam oldu.Don de bir bak istersen";

        countMaxValue(values);
    }

    private static void countMaxValue(String str) {

        int len = str.length();
        int[] freq = new int[256];
        for(int i = 0; i < len; i++) {
            if(str.charAt(i) != ' ')
            freq[str.charAt(i)]++;
        }
        int maxCount = 0;
        char maxChar = ' ';
        for(int i = 0; i < len; i++) {
            if(maxCount < freq[str.charAt(i)]) {
                maxCount = freq[str.charAt(i)];
                maxChar = str.charAt(i);
            }
        }
        System.out.println("En fazla tekrar eden karakter: " + maxChar);
        System.out.println("Tekrar sayısı: " + maxCount);
        /*En fazla tekrar eden karakter: a
         Tekrar sayısı: 11*/
    }
}

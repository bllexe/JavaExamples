package org.example.Collections.descending;



public class DescendingOrder {
    public static void main(String[] args) {

        System.out.println(sortDesc(1254859723));
    }


    public static int sortDesc(final int num) {

        String temp = Integer.toString(num);
        int[] a = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            a[i] = temp.charAt(i) - '0';
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    a[i] += a[j];
                    a[j] = a[i]-a[j];
                    a[i] = a[i]-a[j];
                }
            }
        }
        StringBuffer strbuff = new StringBuffer();
        for (int i : a) {
            strbuff.append(i);
        }
        return new Integer(strbuff.toString()).intValue();
    }
}
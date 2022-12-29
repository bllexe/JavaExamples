package org.example.NumbersExam.reverseNumber;

public class ReverseNumber {

   // Given a signed 32-bit integer x, return x with its digits reversed.
        public int reverse(int x) {
            boolean isNegative = x < 0;

            x = Math.abs(x);

            int num = 0;

            while (x > 0) {
                if (Integer.MAX_VALUE / 10 < num) return 0;

                num = 10 * num + x % 10;
                x /= 10;
            }

            return isNegative ? -num : num;
        }

}

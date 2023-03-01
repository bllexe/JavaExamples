package org.example.advanced.MaxSum;

public class Solution {
    /*find the max sum of i*A[i] where A[i] is the element at index i in the array.*/

    public static void main(String[] args) {

        int[] A = {8, 3, 1, 2};
        int n = A.length;
        System.out.println(max_sum(A, n));
    }

    private static int max_sum(int[] A, int n) {

        int res = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int curr_sum = 0;

            for (int j = 0; j < n; j++) {
                int index = (i + j) % n;
                curr_sum += j * A[index];
            }
            res = Math.max(res, curr_sum);
        }
        return res;
    }
}

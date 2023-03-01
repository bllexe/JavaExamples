package org.example.advanced.inversionCount;

public class Solution {

    public static void main(String[] args) {

        int N=3;
        long arr[]={10, 10, 10};
        System.out.println(inversionCount(arr,N));

        //Find the Inversion Count in the array.
    }

    public static long inversionCount(long arr[],long N){

        int count=0;
        for(int i=0;i<N-1;i++){
            for(int j=i+1;j<N;j++){
                if (arr[i]>arr[j]){
                    count++;
                }
            }
        }

        return count;
    }
}

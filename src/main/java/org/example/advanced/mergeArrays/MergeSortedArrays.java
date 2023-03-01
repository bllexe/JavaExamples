package org.example.advanced.mergeArrays;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class MergeSortedArrays {

    public static void main(String[] args) {

       int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(mergeKArrays(arr,arr.length));
    }

    public static ArrayList<Integer> mergeKArrays(int[][] arr, int K)
    {
        PriorityQueue<Integer> heap=new PriorityQueue<>();
        ArrayList<Integer> list=new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                heap.add(arr[i][j]);
            }
        }
        for(int i=0;i<K*K;i++){
            list.add(heap.poll());
        }

        return list;
    }
}

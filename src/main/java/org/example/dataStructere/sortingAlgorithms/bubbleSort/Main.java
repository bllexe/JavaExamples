package org.example.dataStructere.sortingAlgorithms.bubbleSort;

public class Main {

    /*Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in the wrong order.
     This algorithm is not suitable for large data sets as its average and worst-case time complexity is quite high.
     Time Complexity: O(N2)
     Advantages:
            Bubble sort is easy to understand and implement.
            It does not require any additional memory space.
            It’s adaptability to different types of data.
     Disadvantages:
            Bubble sort has a time complexity of O(n^2) which makes it very slow for large data sets.
            It is not efficient for large data sets, because it requires multiple passes through the data.
            It is not a stable sorting algorithm, meaning that elements with the same key value may not maintain their relative order in the sorted output.

     */

    public static void main(String[] args) {

        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
        int n = arr.length;
        System.out.println("Unsorted Array=>" + " ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        bubbleSort(arr, n);
        System.out.println("Sorted array: ");
        printArray(arr, n);
    }

    private static void printArray(int[] arr, int size) {
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    private static void bubbleSort(int[] arr, int n) {
        int i, j, temp;
        boolean swapped;
        for(i=0;i<n;i++){
            swapped=false;
            for (j=0;j<n-i-1;j++){
                if (arr[j] > arr[j + 1])
                {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped==false)
                break;
        }

    }
}

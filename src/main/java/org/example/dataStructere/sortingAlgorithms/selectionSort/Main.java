package org.example.dataStructere.sortingAlgorithms.selectionSort;


public class Main {

    /*Advantages of Selection Sort Algorithm:
            Simple and easy to understand.
            Preserves the relative order of items with equal keys which means it is stable.
            Works well with small datasets.
            It is adaptable to various types of data types.
            Selection sort is an in-place sorting algorithm, which means it does not require any additional memory to sort the list.
     *Disadvantages of Selection Sort Algorithm:
            Selection sort has a time complexity of O(n^2) in the worst and average case.
            Does not works well on large datasets.
            Time Complexity: The time complexity of Selection Sort is O(N2)
*/

    public static void main(String[] args) {

        int arr[] ={64,25,12,22,11};

        System.out.println("Unsorted Array =>");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
        sorting(arr);
        System.out.println("Sorted Array=>");
        printSorting(arr);

    }

    private static void printSorting(int[] arr) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
    }
    private static void sorting(int[] arr) {
        int len=arr.length;
        for(int i=0;i<len-1;i++){
            int minVal=i;
            for (int j=i+1;j<len;j++)
                if (arr[j]<arr[minVal])
                    minVal=j;
            int temp=arr[minVal];
            arr[minVal]=arr[i];
            arr[i]=temp;
        }
    }
}

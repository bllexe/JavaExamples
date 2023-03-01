package org.example.dataStructere.searchingAlgorithms.linearSearch;

public class Main {
      /*
        * Time complexity: O(N)

        * Advantages of Linear Search:
                    Linear search is simple to implement and easy to understand.
                    Linear search can be used irrespective of whether the array is sorted or not. It can be used on arrays of any data type.
                    Does not require any additional memory.
                    It is a well suited algorithm for small datasets.
        * When to use Linear Search:
                    When we are dealing with a small dataset.
                    When you need to find an exact value.
                    When you are searching a dataset stored in contiguous memory.
                    When you want to implement a simple algorithm.
        */

    public static void main(String[] args) {

        int arr[] = { 2, 3, 4, 10, 40 };
        int x = 10;

        int result = search(arr, x);
        if (result == -1)
            System.out.print("Element is not present in array");
        else
            System.out.print("Element is present at index " + result);

    }

    public static int search(int arr[], int x)
    {
        int N = arr.length;
        for (int i = 0; i < N; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }

}

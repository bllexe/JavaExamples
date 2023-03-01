package org.example.dataStructere.searchingAlgorithms.ternarySearch;

public class Main {
    /*Steps to perform Ternary Search:
        First, we compare the key with the element at mid1. If found equal, we return mid1.
        If not, then we compare the key with the element at mid2. If found equal, we return mid2.
        If not, then we check whether the key is less than the element at mid1. If yes, then recur to the first part.
        If not, then we check whether the key is greater than the element at mid2. If yes, then recur to the third part.
        If not, then we recur to the second (middle) part.
*/

    public static void main(String[] args) {

        int l, r, p, key;

        int ar[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        l = 0;
        r = 9;
        key = 5;
        p = ternarySearch(l, r, key, ar);
        System.out.println("Index of " + key + " is " + p);
        key = 50;
        p = ternarySearch(l, r, key, ar);
        System.out.println("Index of " + key + " is " + p);

    }

    static int ternarySearch(int l, int r, int key, int ar[]) {
        if (r >= l) {

            int mid1 = l + (r - l) / 3;
            int mid2 = r - (r - l) / 3;
            if (ar[mid1] == key) {
                return mid1;
            }
            if (ar[mid2] == key) {
                return mid2;
            }
            if (key < ar[mid1]) {

                return ternarySearch(l, mid1 - 1, key, ar);
            } else if (key > ar[mid2]) {

                return ternarySearch(mid2 + 1, r, key, ar);
            } else {

                return ternarySearch(mid1 + 1, mid2 - 1, key, ar);
            }

        }
        return -1;
    }

}
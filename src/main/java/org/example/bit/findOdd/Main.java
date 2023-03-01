package org.example.bit.findOdd;

public class Main {

    public static void main(String[] args) {

        int arr[] = new int[]{20, 1, 1, 2, 2, 3, 3, 5, 5, 4, 20, 4, 5};
        System.out.println(findOdd(arr));
    }

    public static int findOdd(int [] arr) {

        for (int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if (arr[i]==arr[j]){
                    count++;
                }
                if (count%2!=0)
                    return arr[i];
            }
        }
        return -1;
    }
}

package org.example.advanced.minNumberJump;

public class Solution {

    public static void main(String[] args) {
        int arr[]={1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};

        System.out.println(minJumps(arr));
    }

    private static int minJumps(int[] arr) {
        if (arr[0]==0){
            //checkin first value if the equal 0  can't move forward
            return -1;
        }

        int maxValue=arr[0];
        int step=arr[0];
        int jumps=1;

        for(int i=0;i<arr.length;i++){
            if (i==arr.length-1){
                //checking if end of the array
                return jumps;
            }

            maxValue=Math.max(maxValue,i+arr[i]);
            step--;

            if (step==0){
                if(i>=maxValue){
                    return -1;
                }

                if (i<maxValue)
                    step=maxValue-i;
            }
        }
        return -1;
    }
}

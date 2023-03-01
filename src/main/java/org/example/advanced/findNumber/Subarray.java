package org.example.advanced.findNumber;

import java.util.ArrayList;

public class Subarray {

    public static void main(String[] args) {
        //The sum of elements
        //from 2nd position to 4th position
        //is 12.

        int n=5;
        int s=12;
        int diz[]={1,2,3,4,5};
        ArrayList<Integer> list=new ArrayList<>();
        list=subarraySum(diz,n,s);

        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }

  static ArrayList<Integer> subarraySum(int[] arr, int n, int s){
    ArrayList<Integer> lists=new ArrayList<>();
    int st=0;
    int sum=0;
    for(int i=0;i<n;i++){
        sum+=arr[i];
        while (sum>s){
            sum-=arr[st];
            st++;
        }
        if (sum==s && sum !=0){
            lists.add(st+1);
            lists.add(i+1);
            return lists;
        }
    }
    lists.add(-1);
    return lists;
}

}


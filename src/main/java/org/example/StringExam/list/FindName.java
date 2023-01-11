package org.example.StringExam.list;

import java.util.HashSet;
import java.util.Set;

public class FindName {

    public static void main(String[] args) {
        String[] name = {"user1", "user2", "user3", "user4", "user5", "user6"};
        System.out.println(findName(name));
    }

    public static int findName(String[] names) {

        String searchName = "user4";

        for(int i=0;i<names.length;i++){
            if (names[i].equals(searchName)){
                return i;
            }
        }
        return -1;
    }
}

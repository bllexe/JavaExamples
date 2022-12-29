package org.example.Collections.sortingMap;

import java.util.*;
import java.util.Map.Entry;

public class SortHashMap {

    public static void main(String[] args) {
        Map<String,Integer> ageMap=new HashMap<>();
        ageMap.put("user1",30);
        ageMap.put("user2",20);
        ageMap.put("user3",40);
        ageMap.put("user4",25);
        ageMap.put("user5",26);

        System.out.println(ageMap);
        ageMap=sortByAge(ageMap);
        System.out.println("sorting map by age " + ageMap);
    }

    private static Map<String, Integer> sortByAge(Map<String, Integer> ageMap) {
        Map<String, Integer> sortedByValue = new LinkedHashMap<>();

        Set<Entry<String, Integer>> entrySet = ageMap.entrySet();
        System.out.println(entrySet);

        List<Entry<String, Integer>> entryList = new ArrayList<>(entrySet);
        System.out.println(entryList);

        entryList.sort((x, y) -> x.getValue().compareTo(y.getValue()));
        System.out.println(entryList);

        for (Entry<String, Integer> e : entryList)
            sortedByValue.put(e.getKey(), e.getValue());

        return sortedByValue;
    }
}

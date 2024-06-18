package com.practice.problems.collection;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class NthSalaryFromMap {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("vivek", 100);
        map.put("Rinku", 400);
        map.put("vishal", 600);
        map.put("shankar", 500);
        map.put("shyam", 500);
        map.put("tinku", 300);
        System.out.println(findNthSalary(map , 2));
    }

    private static String findNthSalary(Map<String, Integer> map, int n) {

       LinkedHashMap<String, Integer> sortedBySalary =  map.entrySet()
                                                            .stream()
                                                           // .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                                                            .sorted(Comparator.comparing(Map.Entry::getValue,Comparator.reverseOrder()))
                                                            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1,e2) -> e1,LinkedHashMap::new));

       String person = sortedBySalary.entrySet().stream().skip(1).findFirst().orElse(null).getKey();

       return person;
    }
}

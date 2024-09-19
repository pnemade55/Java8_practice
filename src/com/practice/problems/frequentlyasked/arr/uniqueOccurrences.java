package com.practice.problems.frequentlyasked.arr;

import java.util.*;
import java.util.stream.Collectors;

class uniqueOccurrences {
    public static boolean uniqueOccurrences(int[] arr) {

        Set<Integer> hs= new HashSet<>();

        List<Long> result = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(a-> a, Collectors.counting()))
                .entrySet()
                .stream()
                .map(Map.Entry::getValue)
                .filter(a-> !hs.add((a.intValue())))
                .collect(Collectors.toList());

        if(result.size()==0){
            return true;
        }else {
            return false;
        }
    }

    public static boolean uniqueFrequencyUsingMapSet(int[] arr){
        Map<Integer, Integer> freq = new HashMap<>();

        for(int num: arr){
            freq.put(num, freq.getOrDefault(num,0)+1);
        }

        Set<Integer> freqSet= new HashSet<>(freq.values());

        return freq.size() == freqSet.size();
    }

    public static void main(String[] args) {
       System.out.println( uniqueOccurrences(new int[]{1,2,2,1,1,3}));

        System.out.print( uniqueFrequencyUsingMapSet(new int[]{1,2,2,1,1,3}));
    }
}
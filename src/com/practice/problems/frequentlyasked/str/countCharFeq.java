package com.practice.problems.frequentlyasked.str;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class countCharFeq {

    public static void main(String[] args) {
        String input= "java is my favorite Language";
        char c='a';

       Optional<Integer> result =  input.chars()
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(a,b)-> a, LinkedHashMap::new))
                .entrySet()
                .stream()
               .map(e-> e.getKey())
                .findFirst();



        char r = (char) (int)result.get();
       System.out.println(r);
    }
}
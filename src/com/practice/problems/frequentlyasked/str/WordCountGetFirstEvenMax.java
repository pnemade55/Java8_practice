package com.practice.problems.frequentlyasked.str;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordCountGetFirstEvenMax {

    public static void main(String[] args) {
        String input= "lang java is the bestest ";

      Optional<String> result=  Arrays.stream(input.trim().split("\\s+"))
                .collect(Collectors.toMap(s-> s, s-> s.length()))
                .entrySet()
                .stream()
                .filter(e->e.getValue()%2==0)
            //    .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a,b)-> a, LinkedHashMap::new))
                //.entrySet().stream().forEach(e -> System.out.println(e.getKey()+","+e.getValue()))
                .entrySet()
                .stream()
                .map(a -> a.getKey())
                .findFirst();

       System.out.println(result.get());
    }
}
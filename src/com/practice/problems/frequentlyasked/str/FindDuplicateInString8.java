package com.practice.problems.frequentlyasked.str;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateInString8 {

    public static void main(String[] args) {
    String input = "JavaAPI";

        List<String> duplicateList =Arrays.stream(input.split(""))
                .map(s -> s.toUpperCase())
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() > 1).map(e -> e.getKey())
                .collect(Collectors.toList());


//    List<Character> duplicateList= input.chars().mapToObj(x -> Character.toUpperCase((char) x))
//            .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
//            .entrySet().stream().filter(x -> x.getValue() > 1L).map(Map.Entry::getKey).collect(Collectors.toList());

    System.out.println(duplicateList);
}

}

package com.practice.stream.problems;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstRepeated {
    public static void main(String[] args) {

        String input = "Java Articles are Awesome";

        Character result = input.chars()
                .mapToObj(s -> Character.toUpperCase(Character.valueOf((char) s)))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue()> 1)
                .findFirst()
                .get()
                .getKey();

        System.out.println(result);
        //-----------------------------
        HashSet<Character> hs= new HashSet<>();
        Character result2 = input.chars()
                            .mapToObj(s->Character.toUpperCase(Character.valueOf((char) s)))
                            .filter(c -> !hs.add(c))
                            .findFirst()
                            .get();

        System.out.println(result2);
    }
}

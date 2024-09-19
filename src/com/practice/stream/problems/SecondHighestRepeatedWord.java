package com.practice.stream.problems;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SecondHighestRepeatedWord {
    public static void main(String[] args) {

        List<String> names= Arrays.asList("AK","JK","PK","AK","JK","JK","JK","AK");

        Map.Entry<String,Long> secondHighest = names.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.<String,Long>comparingByValue().reversed())
                .skip(1)
                .findFirst()
                .get();


        System.out.println(secondHighest.getKey()+" : "+ secondHighest.getValue());
    }
}

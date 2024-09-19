package com.practice.stream.problems;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountFrequencyPercentage {

    public static void main(String[] args) {
        List<String> input =
                List.of("FOO", "FOO", "FOO", "FOO", "FOO", "BAR",
                        "BAR", "BAZ", "BAZ", "BAZ", "DOO", "DOO");

       Map<String, Double> freqPercent=  input.stream()
                .collect(Collectors
                        .groupingBy(a -> a,
                                    Collectors.collectingAndThen(
                                            Collectors.counting(),
                                            count -> ((double) count / input.size() * 100))));

       freqPercent.entrySet()
               .stream()
               .forEach( e-> System.out.println(e.getKey() +" : "+ e.getValue()));
    }
}

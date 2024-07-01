package com.practice.problems.frequentlyasked.str;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCharactersAndCount {

    public static void main(String[] args) {

            String input="vivek kadiyan";
            Map<String,Long> duplicateCharacter = findDuplicateChracterCount(input);

            duplicateCharacter.entrySet().stream().forEach(e -> System.out.print("[" + e.getKey()+","+e.getValue()+ "] "));

            String input2="of IT world I am a soldier of a java programming";
            Map<String,Long> abc = Arrays.stream(input2.split("\\s+"))
                    .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                    .entrySet()
                    .stream()
                    .filter(e -> e.getValue()%2==0)
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

            System.out.println(abc.entrySet().stream().findFirst().get());



    }

    private static Map<String,Long> findDuplicateChracterCount(String input) {

        Map<String,Long> abc=Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() >1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        return abc;
    }
}

package com.practice.problems.frequentlyasked.str;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCharacters {

    public static void main(String[] args) {

            String input="vivek kadiyan";
            List<String> duplicateCharacter = findDuplicateChracter(input);
            System.out.println("Duplicate character::::"+duplicateCharacter);

    }

    private static List<String> findDuplicateChracter(String input) {

       return  Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() >1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

    }
}

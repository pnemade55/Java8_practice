package com.practice.problems.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DuplicateNumber {
    public static void main(String[] args) {
        int a[] = { 1, 4, 5, 2, 12, 34, 2, 11,2,4,5 };
        System.out.println("Duplicate number by java 1.8 : " + findDuplicateNumberByJava1_8(a));

        System.out.println("Is Palindrome No : " + isPalindromeNumberByJava8(16461));

        String input = "JavaAPI";

        duplicateCharslist(input);

    }

    private static void duplicateCharslist(String input) {

       Map<Character, Long> dups=input.chars().mapToObj(s-> (char)s)
               .map(s-> Character.toUpperCase(s))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

       dups.entrySet().stream().filter(e -> e.getValue() >1).forEach(System.out::println);
    }

    private static List<Integer> findDuplicateNumberByJava1_8(int[] a) {

       List<Integer> result= Arrays.stream(a)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() >1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

       return result;
    }



    private static boolean isPalindromeNumberByJava8(int n) {
        String value = String.valueOf(n);
        int len = value.length();
        boolean isPalindromeNumber = IntStream.range(0, len / 2)
                .anyMatch(index -> value.charAt(index) == value.charAt(len - index - 1));
        return isPalindromeNumber;
    }
}

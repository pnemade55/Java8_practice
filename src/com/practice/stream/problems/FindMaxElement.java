package com.practice.stream.problems;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindMaxElement {

    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32,15);
        int max =  myList.stream()
                .max(Integer::compare)
                .get();

        System.out.println(max);

    }
}

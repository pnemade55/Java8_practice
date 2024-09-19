package com.practice.stream.problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortDescending {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);

        List<Integer> ls= myList.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        ls.forEach(System.out::println);

        int arr[] = new int[]{10,15,8,49,25,98,98,32,15};

        //Arrays.stream(arr).mapToObj(i -> Integer.valueOf(i)).sorted().forEach(System.out::println);

        //To find max number from below :
        // System.out.println(Arrays.stream(arr).max().getAsInt());
        // Arrays.stream(arr).boxed().max(Comparator.comparingInt(Integer::intValue)).get();
    }
}

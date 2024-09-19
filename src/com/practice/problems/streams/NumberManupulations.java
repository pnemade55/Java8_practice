package com.practice.problems.streams;

import java.util.Arrays;
import java.util.Comparator;

public class NumberManupulations {
    public static void main(String[] args) {
        int a[] = { 2, 3, 1, 22, 11, 33, 5 };

        // Find the max number
        int max = Arrays.stream(a).boxed().max(Integer::compareTo).get();
        System.out.println(max);

        int min = Arrays.stream(a).boxed().max(Comparator.reverseOrder()).get();
        System.out.println(min);

        int arr[] = { 2, 3, 1, 22, 11, 33, 5 };
        int max1 = Arrays.stream(arr).boxed().reduce(Integer.MIN_VALUE, Integer::max);
        System.out.println(max1);
    }
}

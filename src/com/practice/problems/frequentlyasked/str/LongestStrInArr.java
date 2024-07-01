package com.practice.problems.frequentlyasked.str;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class LongestStrInArr {

    public static void main(String[] args) {
        //find the longest string in given input array
        String [] arrayInput = {"vivek"  , "kadiyan" , "ram" , "chaudhary vivek kadiyan"};
        String longestString = Arrays.stream(arrayInput).reduce((w1,w2) -> w1.length()  > w2.length()?w1:w2).get();

        System.out.println(longestString);

       int sum = Arrays.stream(arrayInput)
                .collect(Collectors.toMap(w -> w, w-> w.length()))
                .entrySet()
                .stream()
                .map(Map.Entry::getValue)
                .reduce(0, Integer::sum);

       System.out.println(sum);
    }
}

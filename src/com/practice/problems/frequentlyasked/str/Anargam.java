package com.practice.problems.frequentlyasked.str;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Anargam {

    public static void main(String[] args) {
        String input1= "aarmy";
        String input2= "maray";

        System.out.print(anargam(input1, input2));
    }

    private static boolean anargam(String input1, String input2) {
        if(input1.length() != input2.length()){
            return false;
        }

        HashSet<String> hs2= new HashSet<>();
        hs2.addAll(List.of(input2.split("")));

        Map<String, Long> input1map = Arrays.stream(input1.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Map<String, Long> input2map = Arrays.stream(input2.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        for(String str: input2map.keySet()){
            if(input1map.get(str)!=input2map.get(str)){
                return false;
            }
        }
        return true;
    }
}

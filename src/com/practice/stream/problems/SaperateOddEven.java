package com.practice.stream.problems;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SaperateOddEven {

    public static void main(String[] args) {
        List<Integer> ls= Arrays.asList(2,3,4,5,6,7,8,9);
        //------ using partition by

        Map<Boolean, List<Integer>> rs1 =  ls.stream()
                .collect(Collectors.partitioningBy(n -> n%2==0));

        rs1.get(Boolean.FALSE).stream().forEach(System.out::println);

        //------- using group by

       Map<Boolean, List<Integer>> rs2= ls.stream()
                .collect(Collectors.groupingBy(n -> n%2==0, Collectors.mapping(n-> n, Collectors.toList())));

       rs2.get(Boolean.TRUE).stream().forEach(System.out::println);

    }
}

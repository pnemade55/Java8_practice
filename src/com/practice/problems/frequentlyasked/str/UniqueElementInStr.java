package com.practice.problems.frequentlyasked.str;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueElementInStr {

    public static void main(String[] args) {
        String input="vivekkadiyan";
        System.out.println(unquieElements(input));

    }

    private static List<String> unquieElements(String input) {

        return Arrays.stream(input.split(""))
                .distinct()
                //.sorted(String::compareTo)
                .collect(Collectors.toList());
    }
}

package com.practice.problems.frequentlyasked.str;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class fizzBuzz {
    public static void main(String[] args) {
        fizzBuzz(15).stream().forEach(System.out::println);
    }
    public static List<String> fizzBuzz(int n) {

       return IntStream.rangeClosed(1, n).boxed()
                .map(a -> {
                            if (a.intValue() % 3 == 0 && a.intValue() % 5 == 0) {
                                return "FizzBuzz";
                            } else if (a.intValue() % 3 == 0) {
                                return "Fizz";
                            } else if (a.intValue() % 5 == 0) {
                                return "Buzz";
                            } else {
                                return "" + a.intValue();
                            }
                        }
                    ).collect(Collectors.toList());

    }

}

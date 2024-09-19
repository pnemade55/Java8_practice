package com.practice.problems.streams;

import java.util.stream.IntStream;

public class Prime {

    public static void main(String[] args) {

      Boolean prime=  isPrime(22);

      System.out.println(prime);
    }

    private static Boolean isPrime(int n) {

      return  IntStream.range(2, n/2).noneMatch(a -> n %a==0);

    }
}

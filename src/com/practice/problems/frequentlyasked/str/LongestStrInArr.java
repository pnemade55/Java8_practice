package com.practice.problems.frequentlyasked.str;

import java.util.Arrays;

public class LongestStrInArr {

    public static void main(String[] args) {
        //find the longest string in given input array
        String [] arrayInput = {"vivek"  , "kadiyan" , "ram" , "chaudhary vivek kadiyan"};
        String longestString = Arrays.stream(arrayInput).reduce((w1,w2) -> w1.length()  > w2.length()?w1:w2).get();

                System.out.println(longestString);
    }
}

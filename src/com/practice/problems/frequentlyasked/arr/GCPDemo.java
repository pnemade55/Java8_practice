package com.practice.problems.frequentlyasked.arr;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GCPDemo {
    public static void main(String[] args) {
        int[] nums = {12,9,6,24,3};

        List<Integer> listOfIntegers= Arrays.stream(nums).boxed().collect(Collectors.toList());

        int max=listOfIntegers
                .stream()
                .mapToInt(a -> a)
                .max().orElse(0);


        int min=   listOfIntegers
                .stream()
                .mapToInt(a -> a)
                .min().orElse(0);

        System.out.println(max +","+min);

        int i=1;
        int op=0;
        while(i < min){
            if(min%i==0 && max%i==0){
               op=i;
            }
            i++;
        }
        System.out.println("greateest common devisor :"+op);
    }
}

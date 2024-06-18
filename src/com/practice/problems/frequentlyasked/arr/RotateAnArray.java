package com.practice.problems.frequentlyasked.arr;

import java.util.Arrays;

public class RotateAnArray {

    public static void main(String[] args) {

        int[] input={1,2,3,4,5,6,7};
        int rotate=3;

        rotateLeft(input,3);
        System.out.println();
        rotateRight(input,3);
    }

    private static void rotateLeft(int[] input, int n) {

        while(n>0) {
            int first = input[0];
            for (int i = 0; i < input.length - 1; i++)
                input[i] = input[i + 1];

            input[input.length - 1] = first;

            n--;
        }

        Arrays.stream(input).sequential().forEach(System.out::print);
    }

    private static void rotateRight(int[] input, int n) {

        while(n>0) {
            int last = input[input.length - 1];

            for (int i = input.length - 1; i > 0; i--)
                input[i] = input[i - 1];

            input[0] = last;

            n--;
        }

        Arrays.stream(input).sequential().forEach(System.out::print);
    }
}

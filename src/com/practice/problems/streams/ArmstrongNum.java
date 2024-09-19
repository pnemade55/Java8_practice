package com.practice.problems.streams;

public class ArmstrongNum {

    public static void main(String[] args) {
        Boolean armStrng=  isArmstrongNumberByJava8(22);
       int a= Character.digit(String.valueOf(25).charAt(0), 10);
        System.out.println(a);
    }

    private static boolean isArmstrongNumberByJava8(int n) {
        int len= String.valueOf(n).length();
        int sum= String.valueOf(n).chars().map(ch -> Character.digit(ch, 10))
                .map(x -> (int)Math.pow(x, len))
                .sum();

        return sum==n;
    }
}

package com.practice.problems.oops;

public class TestEnv {

    public static void main(String[] args) {
       String s=  Environment.TEST.getEnv();

       System.out.println(s);
    }
}

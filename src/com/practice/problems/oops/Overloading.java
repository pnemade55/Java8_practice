package com.practice.problems.oops;

public class Overloading {
    public static void main(String[] args) {
        print(null);  ///more specific class is string so string methods will be called
    }

    public static void print(Object obj) {
        System.out.println("Object");
    }

    public static void print(String str) {
        System.out.println("String");
    }
}

package com.practice.problems.frequentlyasked.str;

public class StringLiterals {
    public static void main(String[] args) {
        String s1="Java";
        String s2="Java";
        String s3="Create";

        String n1= new String("Java");
        String n2= new String("Java");
        String n3= new String("Create");

        System.out.println(s1==s2);
        System.out.println(n1==n2);
        System.out.println(s3==n3);
    }
}

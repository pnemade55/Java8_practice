package com.practice.problems.frequentlyasked.str;

public class CheckPalindrom {
    public static void main(String[] args) {
        String s1="parap";

        StringBuffer sb= new StringBuffer(s1).reverse();
        String revS1= sb.toString();

        if(revS1.equals(s1))
            System.out.println(true);
        else
            System.out.println(false);
    }
}

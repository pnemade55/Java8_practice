package com.practice.problems.frequentlyasked.str;

import java.util.Arrays;

public class LengthOfLastWord {

    public static void main(String[] args) {
        String s= "   fly me   to   the moon  ";
        s= s.trim();
       String res[]=  s.split("\\s+");
       System.out.println(res[res.length-1].length());

    }
}

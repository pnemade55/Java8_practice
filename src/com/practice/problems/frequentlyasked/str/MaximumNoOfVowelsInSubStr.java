package com.practice.problems.frequentlyasked.str;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class MaximumNoOfVowelsInSubStr {
    public static void main(String[] args) {
    String s= "leetcode";
    int k =3;
    char[] chars= s.toCharArray();
    int count=0;

    HashSet<Character> hset= new HashSet<>();
    hset.addAll(Arrays.asList('a','e','i','o','u'));

        for (int i = 0; i < k; i++) {
            if(hset.contains(chars[i])){
                count++;
            }
        }

        int res = count;

        for (int i = k; i < chars.length; i++) {
            if(hset.contains(chars[i])){
                count= count+1;
                if(hset.contains(chars[i-k])) {
                    count = count - 1;
                }
            }else{
                if(hset.contains(chars[i-k])) {
                    count = count - 1;
                }
            }
            res = Math.max(res,count);
        }

        System.out.println(res);
    }
}

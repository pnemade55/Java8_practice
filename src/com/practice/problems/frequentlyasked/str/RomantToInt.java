package com.practice.problems.frequentlyasked.str;

import java.util.HashMap;

public class RomantToInt {
    public static void main(String[] args) {
        int number = roman2Int("MCMXCIV");
        System.out.println(number);
    }

    private static int roman2Int(String s) {
        HashMap<Character, Integer> romans = new HashMap<>();
        romans.put('I', 1);
        romans.put('V', 5);
        romans.put('X', 10);
        romans.put('L', 50);
        romans.put('C', 100);
        romans.put('D', 500);
        romans.put('M', 1000);

        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i != s.length() - 1) {
                char c1 = s.charAt(i);
                char c2 = s.charAt(i + 1);
                if (romans.get(c1) == romans.get(c2)) {
                    sum = sum + romans.get(c1);
                } else if (romans.get(c1) > romans.get(c2)) {
                    sum = sum + romans.get(c1);
                } else {
                    sum = sum + (romans.get(c2) - romans.get(c1));
                    i++;
                }
            } else {
                sum = sum + romans.get(s.charAt(i));
            }
        }
        return sum;
    }
}

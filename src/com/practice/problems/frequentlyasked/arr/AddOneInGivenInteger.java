package com.practice.problems.frequentlyasked.arr;

public class AddOneInGivenInteger {

    public static void main(String[] args) {
        int digits[]= {9,0,9,9};
       int result[]=  plus1(digits);
     for(int n : result)
         System.out.print(n +" , ");

    }

    private static int[] plus1(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}

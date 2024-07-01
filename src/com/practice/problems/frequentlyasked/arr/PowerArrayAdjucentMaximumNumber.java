package com.practice.problems.frequentlyasked.arr;

import java.util.Map;

public class PowerArrayAdjucentMaximumNumber {

    public static void main(String[] args) {
        int digits[]= {4,5,3,2,10,1};
        int index=0;
        int max= Integer.MIN_VALUE;
        for (int i = 0; i < digits.length-1; i++) {
            int pow= (int)Math.pow(digits[i], digits[i+1])%1000000007;
            //System.out.print(pow+ ",");
            if(max < pow){
                max= pow;
                index=i;
            }
        }
        System.out.println();
        System.out.println(index+1);
    }
}

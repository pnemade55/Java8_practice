package com.practice.problems.frequentlyasked.str;

public class repeatDigitsBasedOnDigit {

    public static void main(String[] args) {
        String str= "abc5abc3";   //output: abc11111abc111
        StringBuffer sb= new StringBuffer();
        for(char a: str.toCharArray()){
            if(Character.isDigit(a)){
                int digit= Integer.parseInt(Character.toString(a));
                for (int i = 0; i < digit; i++) {
                    sb.append('1');
                }
            }else{
                sb.append(a);
            }
        }

        System.out.println(sb);

    }
}

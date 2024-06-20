package com.practice.problems.frequentlyasked.arr;

public class ReverseVowles {
    public static void main(String[] args) {
        System.out.println(reverseVow("aA"));
    }

    public static String reverseVow(String s) {
        StringBuilder sb = new StringBuilder(s);

        int i=0;
        int j=s.length()-1;
        boolean leftFlag=false;
        boolean rightflag=false;
        while(i<j){
            if(sb.charAt(i)=='a' || sb.charAt(i)=='e' || sb.charAt(i)=='i' || sb.charAt(i)=='o' || sb.charAt(i)=='u' ||sb.charAt(i)=='A' || sb.charAt(i)=='E' || sb.charAt(i)=='I' || sb.charAt(i)=='O' || sb.charAt(i)=='U') {
                leftFlag=true;
            } else{
                leftFlag=false;
                i++;
            }

            if(sb.charAt(j)=='a' || sb.charAt(j)=='e' || sb.charAt(j)=='i' || sb.charAt(j)=='o' || sb.charAt(j)=='u' ||sb.charAt(j)=='A' || sb.charAt(j)=='E' || sb.charAt(j)=='I' || sb.charAt(j)=='O' || sb.charAt(j)=='U'){
                rightflag=true;
            }else{
                rightflag=false;
                j--;
            }

            if(leftFlag && rightflag){
                char temp= sb.charAt(i);
                sb.setCharAt(i, sb.charAt(j));
                sb.setCharAt(j, temp);
                i++ ; j--;
            }
        }

        return sb.toString();
    }
}

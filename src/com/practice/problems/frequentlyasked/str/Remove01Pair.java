package com.practice.problems.frequentlyasked.str;

public class Remove01Pair {

    public static void main(String[] args) {
        String str="100100";  //10011  //110010  //111*000  //0
        // program return the length of remaining string
       int length=  remove01(str);
       System.out.println(length);
    }

    private static int remove01(String str) {
        StringBuffer sb= new StringBuffer();
        int i=0;
        String input= str;
        boolean flag;
        while(input.length()> 1 && i< input.length()-1){
            flag=false;
            if(input.charAt(i)=='1' && input.charAt(i+1)=='0' || input.charAt(i)=='0' && input.charAt(i+1)=='1') {

                if(i==0){
                    flag=true;
                    sb.append(input.substring(i+2));
                }
                else {
                    flag=true;
                    sb.append(input.substring(0, i)).append(input.substring(i + 2));
                }
            }
            if(flag){
                input= sb.toString();
                sb=new StringBuffer();
                i=0;
                continue;
            }
            i=i+1;
        }
        return input.length();
    }
}
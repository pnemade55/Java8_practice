package com.practice.problems.frequentlyasked.str;

public class StringCompression {

    public static void main(String[] args) {
        char[] chs = new char[] {'a','a','b','b','c','c','c'};

       int index= compress(chs);

    }



        public static int compress(char[] chars) {
            int count=0;
            int index=0;
            char repeatedChr = 0;
            for(int i =0 ; i< chars.length; i++){
                if(repeatedChr==0 || repeatedChr== chars[i]){
                    repeatedChr=chars[i];
                    count++;
                }else if(i==chars.length-1){

                }else {
                    index+=1;
                    chars[i-1]= (char)(count+'0');
                    repeatedChr = chars[i];
                    count=0;
                }
            }
            return count;
        }
}

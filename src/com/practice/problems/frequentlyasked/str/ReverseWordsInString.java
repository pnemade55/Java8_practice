package com.practice.problems.frequentlyasked.str;

public class ReverseWordsInString {
    public static void main(String[] args) {
        String input=" a good   example   ";
        System.out.println(reverseWords(input));
        System.out.println(reverseWordsRegEx(input));
    }
    private static String reverseWordsRegEx(String input) {
        String[] splits= input.trim().split("\\s+");
        StringBuffer sb= new StringBuffer();
        for (int i = splits.length-1; i>0; i--) {
            sb.append(splits[i]+" ");
        }
        sb.append(splits[0]);
        return sb.toString();
    }

    private static String reverseWords(String input) {
        input = input.trim();
        StringBuffer sb= new StringBuffer();
        String[] splits= input.split(" ");
        for(int i = splits.length-1; i>=0; i--){
            if(splits[i].isBlank()){

            }else{
               sb.append(splits[i]);
               if(i!=0) {
                   sb.append(" ");
               }
            }
        }
        return sb.toString();
    }
}

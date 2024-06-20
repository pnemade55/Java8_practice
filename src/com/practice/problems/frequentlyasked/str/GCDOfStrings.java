package com.practice.problems.frequentlyasked.str;

public class GCDOfStrings {

    public static void main(String[] args) {
        String str1="ABABAB";
        String str2="ABAB";

        String gcd= gcdOfStrings(str1, str2);
        System.out.println(gcd);

        //if we have gcd of array of strings then
        String inputs[]= {"GFGGFG","GFGGFG","GFGGFGGFG"};
        String gcdOfStringArray= inputs[0];
        for (int i = 1; i < inputs.length; i++) {
            gcdOfStringArray=gcdOfStrings(gcdOfStringArray, inputs[i]);
        }
        System.out.println(gcdOfStringArray);
    }

    private static String gcdOfStrings(String str1, String str2) {
        if(str1.length()<str2.length()){
           return gcdOfStrings(str2,str1);
        }
        else if(!str1.startsWith(str2)){
            return "";
        }
        else if(str2.isEmpty()) {
            return str1;
        }
        else{
            return gcdOfStrings(str1.substring(str2.length()),str2);
        }
    }
}

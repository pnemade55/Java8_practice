package com.practice.problems.frequentlyasked.chr;

public class defaultMethodTests {
    public static void main(String[] args) {
        char chr1 = 'a'; char chr1b = 'b';
        char chrN5 = '5';
        char chr3 = '&';

        System.out.println(Character.compare(chr1, chr1));   //if 0  mean equal.. gives ascii difference

        System.out.println("Number is betwwen a-z : " + ('a'<= chr1b && chr1b <= 'z'));
        // should be less than 'a' and greater than 'z'.
        System.out.println("Number is betwwen 1-9 : " + ('1'<= chrN5 && chrN5 <= '9'));

        System.out.println( chrN5 + " isDigit(): "+ Character.isDigit(chrN5) ); //true

        System.out.println( chr1b+" isLetter(): "+ Character.isLetter(chr1b));

        System.out.println( " tab or space using isWhitespace() :"+Character.isWhitespace('\t'));

        //Character.digit('');


    }
}

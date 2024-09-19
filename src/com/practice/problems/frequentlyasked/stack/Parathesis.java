package com.practice.problems.frequentlyasked.stack;

import java.util.Stack;

public class Parathesis {

    public static void main(String[] args) {
       String input="[]({})";

       System.out.print( isValid(input));
    }

    public  static boolean isValid(String s) {

        Stack<Character> stack= new Stack<Character>();

        for(char c: s.toCharArray()){

            if(c == '{' || c=='(' || c=='['){
                stack.push(c);
                continue;
            }

            if(stack.empty()){
                return false;
            }

            char check;
            switch(c) {
                case '}':
                    check = stack.pop();
                    if(check == '(' || check =='[')
                        return false;
                    break;
                case ']':
                    check = stack.pop();
                    if(check == '{' || check =='(')
                        return false;
                    break;
                case ')':
                    check = stack.pop();
                    if(check == '{' || check =='[')
                        return false;
                    break;
            }

        }
        return stack.empty();

    }
}

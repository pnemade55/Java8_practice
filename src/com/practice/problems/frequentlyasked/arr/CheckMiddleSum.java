package com.practice.problems.frequentlyasked.arr;

public class CheckMiddleSum {

    public static void main(String[] args) {
         int arr[]= new int[]{1,1,0,1,0,1};
         int i=0;
         int j=arr.length-1;
         int ls=0;
         int rs= 0;

         while(i<=j){
             if(ls==rs && i==j){
                System.out.println("index: "+i+ "= Value :"+ arr[i]);
                break;
             }else if(ls < rs){
                 ls=ls+arr[i];
                 i++;
             }else{
                 rs= rs+ arr[j];
                 j--;
             }
         }

    }
}

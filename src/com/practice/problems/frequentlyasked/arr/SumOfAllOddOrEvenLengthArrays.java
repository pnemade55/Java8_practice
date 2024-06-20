package com.practice.problems.frequentlyasked.arr;

public class SumOfAllOddOrEvenLengthArrays {
    public static void main(String[] args) {
        int[] arr=  {1,4,2,5,3};
        int len= arr.length;
        sumOfAllOddLengthArrays(arr, len);

        //Need to Work on Even length array pairs
      //  sumOfAllEvenLengthArrays(arr, len);

    }
    private static void sumOfAllEvenLengthArrays(int[] arr, int len) {
        int sum=0;
        for(int i = 0; i< len; i++){

            for (int j = i; j < len; j+=2) {

                for (int k = i; k <=j; k++) {
                    System.out.print(arr[k]+" , ");
                    sum=sum+ arr[k];
                }
                System.out.print("|");
            }
            System.out.println();
        }
        System.out.println("Sum: "+sum);
    }

    private static void sumOfAllOddLengthArrays(int[] arr, int len) {
        int sum=0;
        for(int i = 0; i< len; i++){

            for (int j = i; j < len; j+=2) {

                for (int k = i; k <=j; k++) {
                   System.out.print(arr[k]+" , ");
                    sum=sum+ arr[k];
                }
                System.out.print("|");
            }
            System.out.println();
        }
        System.out.println("Sum: "+sum);
    }
}
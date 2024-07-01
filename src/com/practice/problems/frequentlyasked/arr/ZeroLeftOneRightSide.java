package com.practice.problems.frequentlyasked.arr;

public class ZeroLeftOneRightSide {

    public static void main(String[] args) {
        Integer arr[] = {0,1,0,1,1,1,1,0,1};
        ///-> output : [0,0,1,1,1]

       // Arrays.stream(arr).sorted().forEach(System.out::println);
        // or

        swapArr(arr);

    }

    private static void swapArr(Integer[] arr) {
        int j=arr.length-1;
       int i=0;
        while(i<j){
            if(arr[i]==1){
                if(arr[j]==0){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j--;
            }else{
                i++;
            }
        }

        for (int a: arr) {
           System.out.print(a +",");
        }
    }
}

package com.practice.problems.frequentlyasked.arr;

public class KthSmall {
    public static void main(String[] args) {
        int[] arr= {7, 10, 4, 3, 20, 15};
        int  k= 2;

        int ele= getKthsmallElement(arr, 0, arr.length-1, k);

        System.out.println(ele);
    }

    private static int getKthsmallElement(int[] arr, int low, int high, int k) {

        if(k> 0 && k<=(high-low+1)){
            int pos= partition(arr, low, high);

            if(pos-low == k-1){
                return arr[pos];
            }

            if(pos-low > k-1){
                return getKthsmallElement(arr, low, pos-1, k);
            }else {
                return getKthsmallElement(arr, pos + 1, high, k - pos + low - 1);
            }
        }
        return Integer.MIN_VALUE;
    }

    private static int partition(int[] arr, int low, int high) {

        int pivot= arr[high];
        int i=low;
        for(int j= low; j<high;j++){
            if(arr[j]<pivot){
                swap(arr, i, j);
                i++;
            }
        }
        swap(arr, i, high);
        return i;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]= arr[j];
        arr[j]= temp;
    }
}

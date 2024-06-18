package com.practice.problems.frequentlyasked.arr;

public class KthMaxNumberQuicksort {

    public static void main(String[] args) {
        int[] arr= {7, 10, 4, 3, 20, 15};
        int  k= 2;

        int ele= getKthMinElement(arr, 0, arr.length-1, k);

        System.out.println(ele);
    }

    private static int getKthMinElement(int[] arr, int low, int high, int k) {

        if(k >0 && k<= high-low+1){
            int pos= partition(arr, low, high);

            if(pos-low == k-1){
                return arr[pos];
            }

            if(pos-low > k-1){
                return getKthMinElement(arr, low, pos-1,k);
            }

            return getKthMinElement(arr, pos+1, high, k-pos+low-1);

        }

        return Integer.MIN_VALUE;
    }

    private static int partition(int[] arr, int low, int high) {

        int pivot= arr[high];
        int i=low;

        for (int j = low; j < high; j++) {
            if(arr[j]> pivot) {
                swap(arr, i, j);
                i++;
            }
        }

        swap(arr, i, high);
        return i;

    }

    private static void swap(int[] arr, int a, int b) {
        int temp= arr[a];
        arr[a]= arr[b];
        arr[b]= temp;
    }
}

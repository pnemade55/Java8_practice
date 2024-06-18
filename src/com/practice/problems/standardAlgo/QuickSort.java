package com.practice.problems.standardAlgo;

public class QuickSort {

    public static void main(String[] args) {

        int[] arr = { 10, 7, 8, 9, 1, 5 };
        int N = arr.length;

        // Function call
        quickSort(arr, 0, N - 1);
        System.out.println("Sorted array:");
        printArr(arr);
    }

    private static void quickSort(int[] arr, int low, int high) {
        if(low<high) {

            // find the correct posiiton of pivot
            int pi =  partition(arr, low, high);

            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1,high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];

        //pointer 1 : left most position
        int i= low;

        //pointer 2 : leftmost +1 positon
        //check if element is less than pivot then increment i and swap it with i th index if greater than pivote no change.
        for (int j = low; j < high; j++) {
            if(arr[j]< pivot){
               swap(arr, i,j);
                i++;
            }
        }
        swap(arr, i, high);
        return (i);


    }

    private static void swap(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]= arr[j];
        arr[j]=temp;
    }

    public static void printArr(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

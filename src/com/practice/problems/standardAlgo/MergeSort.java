package com.practice.problems.standardAlgo;

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = { 12, 11, 13, 5, 6, 7 };

        System.out.println("Given Array");
        printArray(arr);

        // Calling of Merge Sort
        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length - 1);

        System.out.println("\nSorted array");
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    private void sort(int[] arr, int left, int right) {

        if(left < right){
            //find the middle point
            int mid= (left+right)/2;

            //divide the array from left to mid
            sort(arr, left,mid);

            //divide the array from mid to right
            sort(arr, mid+1, right);

           // merge sorted arrays
            merge(arr, left, mid, right);
        }

    }

    private void merge(int arr[], int left, int mid, int right){

        //find sizes of left and right block
        int n1= mid-left+1;
        int n2= right-mid;

        int l[]= new int[n1];
        int r[]= new int[n2];

        //copy left and right to new arrays
        for (int i = 0; i < n1; ++i) {
            l[i]= arr[left+i];
        }
        for (int j = 0; j < n2; ++j) {
            r[j]= arr[mid+1+j];
        }

        int i=0,j=0;
        //initial point is captured as we may have different points
        int k=left;

        //compare right to left while merging [3,5] [7,8]
        while(i<n1 && j<n2){
            if(l[i]<=r[j]){
                arr[k]= l[i];
                i++;
            }else {
                arr[k] = r[j];
                j++;
            }
            k++;
        }

        //copy remaining lefts
        while(i< n1){
            arr[k]=l[i];
            k++;
            i++;
        }

        //copy remaining rights
        while(j<n2){
            arr[k]=r[j];
            k++;
            j++;
        }
    }
}

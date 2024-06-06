package com.practice.problems;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={20,15,18,21,25,87,91,99};

        int search = 55;

        int index= binarySearch(arr, search, 0, arr.length-1);

        System.out.println("number is at :"+index);
    }

    private static int binarySearch(int[] arr, int search, int first, int last) {

        if(first <= last) {
            int mid = first + (last - first) / 2;
            if (arr[mid] == search) {
                return mid;
            }

            if (arr[mid] > search) {
                return binarySearch(arr, search, first, mid - 1);
            } else {
                return binarySearch(arr, search, mid + 1, last);
            }
        }
        return -1;
    }


}

package com.practice.problems;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        merge(new int[]{3,7,0,0,0,0},2, new int[]{1,2,5,6}, 4);

        //   Output: [1,2,2,3,5,6]
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        // If there are remaining elements in nums2, copy them
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }

        Arrays.stream(nums1).forEach( s -> System.out.println(s + ","));
    }
}

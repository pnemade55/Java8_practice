package com.practice.problems;

public class RemoveDeplicateSortedArray {
    public static void main(String[] args) {

       //int[] result = removeDuplicates(new int[]{1,1,2});

        int[] result1 = removeDuplicatesBetterWay(new int[]{1,2});

       for(int a: result1){
           System.out.print(a+ " , ");
       }
    }

    public static int[]  removeDuplicatesBetterWay(int[] nums){
        int n = nums.length;
        //  int result[] = new int[n];
        int index = 1;
        // result[0] = nums[0];
        int i = 1;
        while (i < n - 1) {
            int next = nums[i + 1];
            if (nums[i] != next) {

                nums[index] = next;
                index++;
            }
            if (nums[i] == next) {
                // skip
            }
            i++;
        }

        return nums;
    }

    public static int[] removeDuplicates(int[] nums) {
        int n = nums.length;
        int result[] = new int[n];
        int j = 1;
        result[0] = nums[0];
        int i = 1;
        int previous = nums[0];
        while (i < n-1) {
            int next = nums[i + 1];
            if (nums[i] != next) {
                previous = next;
                result[j] = next;
                j++;
            }
            if (nums[i] == next) {
                //skip
            }
            i++;
        }
        nums = result.clone();
        return nums;
    }
}

package com.practice.problems.frequentlyasked.arr.subarray;

public class ContiguousSubArraySUm {

    public static void main(String[] args) {
       int total = subarraySum(new int[]{1,1,1,3}, 3);   //1,2 | 3

       System.out.println(total);
    }

    public static int subarraySum(int[] nums, int k) {

        int count = 0;

        for (int start = 0; start < nums.length; start++) {
            int sum = 0;
            for (int end = start; end < nums.length; end++) {
                sum = sum + nums[end];
                if (sum == k) {
                    count++;
                }
            }
        }

        return count;
    }

}

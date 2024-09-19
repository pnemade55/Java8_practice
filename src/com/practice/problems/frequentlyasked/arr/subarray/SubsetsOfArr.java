package com.practice.problems.frequentlyasked.arr.subarray;

import java.util.ArrayList;
import java.util.List;

public class SubsetsOfArr {

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans= new ArrayList<>();
        int n = nums.length;

        for (int i =0; i< Math.pow(2, n); i++){

            List<Integer> subArr= new ArrayList<>();
            for (int j =0 ; j<n;j++){
                if( (i & (1<<j)) !=0){
                    subArr.add(nums[j]);
                }
            }
            ans.add(subArr);
        }
        return ans;
    }

    public static void main(String[] args) {
        subsets(new int[]{1,2,3})

                .stream().forEach(System.out::println);
    }

}

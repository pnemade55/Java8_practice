package com.practice.problems.frequentlyasked.arr.subarray;
import java.util.HashMap;
import java.util.Map;

public class countPairWithGivenSum {
    // Function to count pairs with given sum
    static int countPairsWithHashMap(int[] arr, int target)
    {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int num : arr) {
            int complement = target - num;

            if (map.containsKey(complement)) {
                count += map.get(complement);
            }
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        return count;
    }
    static int twoSum(int[] arr, int target) {
        int count=0;
        int n=arr.length;
        for (int i = 0; i < n ; i++) {

            for (int j = i+1; j < n; j++) {

                if(arr[i]+ arr[j]== target){
                    count++;
                }
            }
        }
        return count;
    }


    public static void main(String[] args)
    {
        int[] arr = { 1, 5, 7, -1, 5 };
        int target = 6;

        System.out.println( countPairsWithHashMap(arr, target));
    }
}


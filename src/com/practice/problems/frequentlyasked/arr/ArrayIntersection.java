package com.Leetcode.intersectionOfArrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrayIntersection {

    public static void main(String[] args) {

        int [] result= intersect(new int[]{9,4,9,8,4,9,5},new int[]{4,9,5});


        Arrays.stream(result).forEach(a->System.out.print(a+","));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length > nums2.length){
            return intersect(nums2, nums1);
        }
        Map<Integer, Integer> map = new HashMap<>();
        for(int n : nums1){
            map.put(n, map.getOrDefault(n,0)+1);
        }
        int[] result = new int[nums1.length];
        int j=0;
        for(int n: nums2){
            if(map.containsKey(n)){
                int count = map.get(n);
                if(count >0){
                    result[j++] = n;
                    map.put(n, count-1);
                }
            }
        }
        return Arrays.copyOfRange(result,0,j);
    }
}

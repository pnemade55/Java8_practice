package com.practice.problems.streams;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeTwoArray {

    public static void main(String[] args) {
        merge(new int[]{1,2,3,0,0,0},new int[]{2,5,6});
    }

    public static void merge(int[] nums1, int[] nums2) {

        List<Integer> ls1=Arrays.stream(nums1).boxed().collect(Collectors.toList());
        List<Integer> ls2=Arrays.stream(nums2).boxed().collect(Collectors.toList());


        Stream.concat(ls1.stream(), ls2.stream()).filter(s-> s!=0).sorted().forEach(System.out::println);

    }
}

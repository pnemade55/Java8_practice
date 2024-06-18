package com.practice.problems.frequentlyasked.arr;

public class RemoveDeplicateSortedArray {
    public static void main(String[] args) {
        int nums[]= new int[]{0,1,1,1,2,2,3,3,4};
        int resultindex = removeDuplicates(nums);

       for(int i=0; i < resultindex; i++){
           System.out.print(nums[i]+ " , ");
       }
    }

    public static int removeDuplicates(int[] nums){
            int i =0;
            for(int j=1; j<nums.length;j++){
                if(nums[i]!=nums[j]){
                    nums[i+1]=nums[j];
                    i++;
                }
            }
            return i+1;
        }

}

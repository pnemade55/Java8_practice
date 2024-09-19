package com.practice.problems.frequentlyasked.arr;

public class TwoPairSum {

    public static void main(String[] args) {
        int nums[]= {2,11,7,15};
        int result[] = twoSum(nums, 9);
        System.out.println(result[0]+","+result[1]);


    }

    public static int[] twoSum(int[] num, int target) {

        int n= num.length;
        int i=0; int j=1;

        while(num[i] + num[j] != target){
            j++;

            if(j >= n){
                //reset i and j to next index
                i++;
                j= i+1;
            }

            if(i >= n)
            {
                break;
            }

        }

        return new int[]{i,j};

    }

}

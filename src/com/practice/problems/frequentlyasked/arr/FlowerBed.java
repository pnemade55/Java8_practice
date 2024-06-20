package com.practice.problems.frequentlyasked.arr;

public class FlowerBed {

    public static void main(String[] args) {
       int[] flowerbed = {0,1,0};
       int n = 1;
       System.out.println(canPlaceFlowers(flowerbed,n));
    }
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {

        if(flowerbed.length==1 && flowerbed[0]==0 && n==1) {
            return true;
        }

        if(flowerbed.length <=0){
            return false;
        }

        for(int i =0; i< flowerbed.length; i++){
            if(n > 0){
                if(i==0 && flowerbed[i]==0 &&  flowerbed[i+1]==0){
                    flowerbed[i]=1;
                    n--;
                }else if(i==flowerbed.length-1 && flowerbed[i]==0 && flowerbed[i-1]==0){
                    flowerbed[i]=1;
                    n--;
                }else if(i!=0 && flowerbed[i]==0 && flowerbed[i-1]==0 && flowerbed[i+1]==0){
                    flowerbed[i]=1;
                    n--;
                }
            }

            if(n==0){
                return true;
            }
        }
        return false;
    }
}

package com.practice.problems.frequentlyasked.arr;

public class Time2BuyAndSellStock {

    public static void main(String[] args) {
        int prices[]= new int[]{7,1,5,3,6,4};

        int result= maxProfit(prices);

        System.out.println("Max Profit :"+result);

    }


    public static int maxProfit(int[] prices) {
      /*  int maxProfit= 0;

        for(int i =0; i< prices.length; i++){

            for(int j=i+1; j< prices.length; j++){

               maxProfit = Math.max(maxProfit, prices[j]- prices[i]);
            }
        }
        return maxProfit;

        */

        int maxProfit= 0;
        int minValue= Integer.MAX_VALUE;
        int buyDay = 0, sellDay=0;

        for(int i =0; i< prices.length; i++){

            if(prices[i] < minValue) {
                minValue = prices[i];
              //  buyDay = i;
            }
            else if(prices[i] - minValue > maxProfit){
                maxProfit=prices[i] - minValue;
               // sellDay =i;
            }
        }

       // System.out.println("Buy stock on Day:"+ (buyDay+1)+" , Sell stock on Day"+ (sellDay+1));
        return maxProfit;
    }
}

package org.example.array.leetcode;

public class Leetcode_122_BuyAndSellStocks2 {
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        System.out.println("Buy and Sell Stock 1 is : " + buyAndSellStock(prices));
        System.out.println("Buy and Sell Stock 2 is : " + buyAndSellStock2(prices));
    }

    private static int buyAndSellStock2(int[] prices) {
        int maxProfit = 0;
        for(int i=0; i<prices.length-1; i++){
            if(prices[i] < prices[i+1]){
                maxProfit = maxProfit + prices[i+1] - prices[i];
            }
        }
        return maxProfit;
    }

    public static int buyAndSellStock(int prices[]){
        int maxProfit = 0;
        int buyPrice = prices[0];
        for(int i=1; i<prices.length; i++){
            int profit = prices[i] - buyPrice;
            maxProfit = Math.max(maxProfit,profit);
            buyPrice = Math.min(buyPrice,prices[i]);
        }
        return maxProfit;
    }
}

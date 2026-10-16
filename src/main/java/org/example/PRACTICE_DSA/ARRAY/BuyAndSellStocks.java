package org.example.PRACTICE_DSA.ARRAY;

public class BuyAndSellStocks {
    public static void main(String[] args) {
        int nums[] = {7,1,5,3,6,4};
        System.out.println(stocks(nums));
    }
    public static int stocks(int nums[]){
        int maxProfit = 0;
        int buyPrice = nums[0];
        for(int i=1; i<nums.length; i++){
            int profit = nums[i] - buyPrice;
            maxProfit = Math.max(maxProfit, profit);
            buyPrice = Math.min(buyPrice,nums[i]);
        }
        return maxProfit;
    }
}

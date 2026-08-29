package org.example.array.leetcode;

public class Leetcod_53_Maximum_Subarray_Sum {
    public static void main(String[] args) {
        int nums[] = {3,-4,5,4,-1,7,-8};
        System.out.println(maximumSubarray(nums));
    }
    public static int maximumSubarray(int nums[]){
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            sum = sum + nums[i];
            maxSum = Math.max(maxSum, sum);
            if(sum < 0){
                sum = 0;
            }
        }
        return maxSum;
    }
}

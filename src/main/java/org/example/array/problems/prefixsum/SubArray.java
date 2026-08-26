package org.example.array.problems.prefixsum;

public class SubArray {
    public static boolean canSplit(int[] nums) {
        int totalSum = 0;
        // Total sum
        for (int num : nums) {
            totalSum += num;
        }

        // Odd total cannot be divided equally
        if (totalSum % 2 != 0) {
            return false;
        }

        int target = totalSum / 2;
        int prefixSum = 0;
        for(int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];
            if (prefixSum == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {15, 5, 6, 4, 8, 2};
        System.out.println(canSplit(nums));

    }
}

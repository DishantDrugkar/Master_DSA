package org.example.array.problems.prefixsum;

public class PrefixSum {
    public static void main(String[] args) {
        int nums[] = {2,1,3,4,5};
        runningSum(nums);
    }
    public static void runningSum(int nums[]){
        int n = nums.length;
        int sum = 0;
        for(int i=0; i<n; i++){
            sum = sum + nums[i];
            nums[i] = sum;
        }

        for(int num : nums){
            System.out.print(num + " ");
        }
    }
}

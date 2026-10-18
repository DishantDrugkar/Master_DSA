package org.example.array.leetcode;

public class Leetcode_31_NextPermutation {
    public static void main(String[] args) {
        int nums[] = {1,3,5,4,2};
        nextPermutation(nums);
        for(int num : nums){
            System.out.print(num + " ");
        }
    }

    public static void nextPermutation(int nums[]){
        int n = nums.length;
        int i = n - 2;

        // Step 1 : Find pivot
        while(i >= 0 && nums[i] >= nums[i+1]){
            i--;
        }

        // Step 2 : Find just greater element than pivot
        if(i >= 0){
            int j = n - 1;
            while(nums[j] <= nums[i]){
                j--;
            }
          swap(nums,i,j);

        }

        // Step 3 : Reverse right part
        reverse(nums,i+1,n-1);
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}

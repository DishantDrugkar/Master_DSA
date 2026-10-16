package org.example.array.leetcode;

public class Leetcode_283_MovesZeros {
    public static void main(String[] args) {
        int nums[] = {3,0,2,1,0,3};
        movesZeros(nums);
        for(int num : nums){
            System.out.print(num + " ");
        }
    }
    public static void movesZeros(int nums[]){
        int i = 0;
        for(int j=0; j<nums.length; j++){
            if(nums[j] != 0){
                swap(nums, i ,j);
                i++;
            }
        }
    }

    public static void swap(int nums[], int start, int end){
        int temp = nums[end];
        nums[end] = nums[start];
        nums[start] = temp;
    }
}

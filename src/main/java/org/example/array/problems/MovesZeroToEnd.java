package org.example.array.problems;

public class MovesZeroToEnd {
    public static void main(String[] args) {
        int nums[] = {1,0,2,3,2,0,0,4,2};

        movesZero(nums);
        System.out.println("ARRAY AFTER ITERATION:");
        for(int num : nums){
            System.out.print(num + " ");
        }
    }
    public static void movesZero(int nums[]){
        int i = 0;
        int n = nums.length;
        for(int j = 0; j < n; j++){
            if(nums[j] != 0){
                swap(nums, i, j);
                i++;
            }
        }
    }

    public static void swap(int nums[], int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
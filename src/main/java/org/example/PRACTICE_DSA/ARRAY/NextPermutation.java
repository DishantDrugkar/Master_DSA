package org.example.PRACTICE_DSA.ARRAY;

public class NextPermutation {
    public static void main(String[] args) {
        int nums[] = {1,2,3};
        permutation(nums);
        for(int num : nums){
            System.out.print(num + " ");
        }
    }

    public static void permutation(int nums[]){
        int n = nums.length;
        int i = n - 2;
        while(i >= 0 && nums[i] >= nums[i+1]){
            i--;
        }
        if(i >= 0){
            int j = n - 1;
            while(nums[j] <= nums[i]){
                j--;
            }
            swap(nums, i ,j);
        }
        reverse(nums, i+1,n-1);
    }

    public static void swap(int nums[], int start, int end){
        int temp = nums[end];
        nums[end] = nums[start];
        nums[start] = temp;
    }

    public static void reverse(int nums[], int start, int end){
        while(start < end){
            swap(nums,start,end);
            start++;
            end--;
        }
    }
}

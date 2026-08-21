package org.example.array.leetcode;

public class Leetcode_189_RotateArray {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(nums,k);

        for(int num : nums){
            System.out.print(num + " ");
        }
    }
    public static void rotate(int nums[], int k){
        int n = nums.length;
        k = k % n;
        reverse(0,n-1,nums);
        reverse(0,k-1,nums);
        reverse(k,n-1,nums);
    }

    public static void reverse(int start, int end, int nums[]){
        while(start < end){
            int temp = nums[end];
            nums[end] = nums[start];
            nums[start] = temp;
            start++;
            end--;
        }
    }
}

package org.example.array.leetcode;

public class Leetcode_26_Sort_0s1s2s {
    public static void main(String[] args) {
        int nums[] = {2,0,1,0,2,1,1,2,0};
        sortColors(nums);
        for(int num : nums){
            System.out.print(num + " ");
        }
    }
    public static void swap(int nums[], int start , int end){
        while(start <= end){
            int temp = nums[end];
            nums[end] = nums[start];
            nums[start] =  temp;
            start++;
            end--;
        }
    }

    public static void sortColors(int nums[]){
        int low = 0;
        int mid = 0;
        int high = nums.length-1;

        while(mid <= high){
            if(nums[mid] == 0){
                swap(nums,low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            }else{
                swap(nums,mid, high);
                high--;
            }
        }
    }
}

package org.example.searching;

public class LinearSearch {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7};
        int target = 2;
        System.out.println(linear(nums,target));
    }
    public static int linear(int nums[], int target){
        int n = nums.length;
        for(int i=0; i<n; i++){
            if(nums[i] == target){
                return i;
            }
        }
        return -1;
    }
}

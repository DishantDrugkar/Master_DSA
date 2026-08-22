package org.example.searching;

public class BinarySearch {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7};
        int target = 2;
        System.out.println(binary(nums,target));
    }
    public static int binary(int nums[], int target){
        int start = 0;
        int end = nums.length-1;
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(nums[mid] ==  target){
                return mid;
            }
            if(nums[mid] < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }
}

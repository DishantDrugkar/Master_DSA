package org.example.array.leetcode;

public class Leetcode_80_RemoveDuplicatesFromSortedArray2 {
    public static void main(String[] args) {
        int nums[] = {1,1,1,2,2,3};
        System.out.println(removeDuplicates(nums));
    }
    public static int removeDuplicates(int nums[]){

        if(nums.length <= 2){    // [1,1] -> Allowed
            return nums.length;
        }

        int k =  2;
        for(int i=2; i<nums.length; i++){
            if(nums[i] != nums[k-2]){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}

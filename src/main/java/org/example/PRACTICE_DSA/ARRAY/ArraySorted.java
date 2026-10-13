package org.example.PRACTICE_DSA.ARRAY;

public class ArraySorted {
    public static void main(String[] args) {
        int nums[] = {1,2,4,5};
        System.out.println(isSorted(nums));
    }
    public static boolean isSorted(int nums[]){
        for(int i=0; i<nums.length-1; i++){
            if(nums[i] > nums[i+1]){
                return false;
            }
        }
        return true;
    }
}

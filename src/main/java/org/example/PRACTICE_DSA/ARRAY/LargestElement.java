package org.example.PRACTICE_DSA.ARRAY;

public class LargestElement {
    public static void main(String[] args) {
        int nums[] = {1,3,2,4,50,6,7};
        System.out.println("Largest Element in an Array : " + getLargest(nums));
    }
    public static int getLargest(int nums[]){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }
        return max;
    }
}

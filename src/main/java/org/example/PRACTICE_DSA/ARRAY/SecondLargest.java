package org.example.PRACTICE_DSA.ARRAY;

public class SecondLargest {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,50,20,10,5};
        System.out.println("Largest Element in an Array is : " + getLargest(nums));
        System.out.println("Second Largest Element in an Array is : " + getSecLargest(nums));
    }
    public static int  getLargest(int nums[]){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }
        return max;
    }

    public static int getSecLargest(int nums[]){
        int large = getLargest(nums);
        for(int i=0; i<nums.length; i++){
            if(nums[i] == large){
                nums[i] = 0;
            }
        }
        int secMax = getLargest(nums);
        return secMax;
    }
}

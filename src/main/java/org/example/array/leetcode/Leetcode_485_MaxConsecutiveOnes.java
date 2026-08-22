package org.example.array.leetcode;

public class Leetcode_485_MaxConsecutiveOnes {
    public static void main(String[] args) {
        int nums[] = {1,1,0,1,1,1};
        int count = 0;
        int maxCount = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1){
                count++;
                maxCount = Math.max(maxCount, count);
            }else{
                count = 0;
            }
        }
        System.out.println(maxCount);
    }
}

package org.example.array.problems;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int nums[] = {1,1,2,2,2,2,3,3};
        System.out.println(removeDuplicates(nums));

        for(int num : nums){
            System.out.print(num + " ");
        }
    }
    public static int removeDuplicates(int nums[]){
        int i=0;
        for(int j=1; j<nums.length; j++){
            if(nums[j] != nums[i]){
                nums[i+1] = nums[j];
                i++;
            }
        }
        return i+1;
    }
}

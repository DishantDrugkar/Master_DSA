package org.example.array.problems;

// Find total no of pairs
public class TargetSum2 {
    public static void main(String[] args) {
        int nums[] = {4,6,3,5,8,2};
        int target = 7;
        int ans = 0;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}

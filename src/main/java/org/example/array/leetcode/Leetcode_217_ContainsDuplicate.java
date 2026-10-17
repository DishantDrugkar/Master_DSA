package org.example.array.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Leetcode_217_ContainsDuplicate {
    public static void main(String[] args) {
        int nums[] = {1,2,3,1};
        System.out.println(containsDuplicates(nums));
    }
    public static boolean containsDuplicates(int nums[]){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                return true;
            }else{
                map.put(nums[i],i);
            }
        }
        return false;
    }
}

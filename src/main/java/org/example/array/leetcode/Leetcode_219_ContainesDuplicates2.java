package org.example.array.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Leetcode_219_ContainesDuplicates2 {
    public static void main(String[] args) {
        int nums[] = {1,2,3,1};
        int k = 3;
        System.out.println(containsDuplicate2(nums,k));
    }
    public static boolean containsDuplicate2(int nums[], int k){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], i);
                System.out.println(map);
            }else{
                int pastIndex = map.get(nums[i]);
                if(Math.abs(pastIndex - i) <= k){
                    return true;
                }else{
                    map.put(nums[i], i);
                }
            }
        }

        return false;
    }
}

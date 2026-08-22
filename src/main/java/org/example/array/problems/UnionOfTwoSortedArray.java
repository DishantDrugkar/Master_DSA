package org.example.array.problems;

import java.util.HashSet;
import java.util.Set;

public class UnionOfTwoSortedArray {
    public static void main(String[] args) {
        int nums1[] = {1,1,2,2,3,4,4,5};
        int nums2[] = {2,3,6,7};

        Set<Integer> set = new HashSet<>();
        for(int num : nums1){
            set.add(num);
        }
        for(int num : nums2){
            set.add(num);
        }
        System.out.println(set);
    }
}

package org.example.array.problems;

public class MissingNumber {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,6,7};
        int n = nums.length + 1;

        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : nums) {
            actualSum = actualSum + num;
        }

        System.out.println("Missing Number : " + (expectedSum - actualSum));
    }
}
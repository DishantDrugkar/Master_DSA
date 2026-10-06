package org.example.math;

public class Leetcode_66_PlusOne {
    public static void main(String[] args) {
        int digits[] = {9,9,9};
        int result[] = plusOne(digits);
        for(int num : result){
            System.out.print(num + " ");
        }
    }
    public static int[] plusOne(int digits[]){
        int d = digits.length;
        for(int i=d-1; i>=0; i--){
            if(digits[i] == 9){
                digits[i] = 0;
            }else{
                digits[i]++;
                return digits;
            }
        }

        digits = new int[d + 1];
        digits[0] = 1;
        return digits;
    }
}

package org.example.basics_of_java.leetcode;

import java.util.Scanner;

public class Leetcode_7_ReverseInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = scanner.nextInt();

        System.out.println("Reverse Number is : " + Reverse(num));
    }
    public static int Reverse(int num){
        long reverse = 0;
        while(num != 0){
            int lastDigit = num % 10;
            reverse = (reverse * 10) + lastDigit;
            num = num / 10;
        }

        if(reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE){
            return 0;
        }

        return (int) reverse;
    }
}

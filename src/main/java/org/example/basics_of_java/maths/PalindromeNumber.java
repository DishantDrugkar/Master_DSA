package org.example.basics_of_java.maths;

public class PalindromeNumber {
    public static void main(String[] args) {
        int num = 123;
        int reverse = 0;
        int originalNumber = num;

        while(num > 0){
            int lastDigit = num % 10;
            reverse = reverse * 10 + lastDigit;
            num = num / 10;
        }

        if(originalNumber == reverse){
            System.out.println("Palindrome Number");
        }else {
            System.out.println("Not a Palindrome Number");
        }
    }
}

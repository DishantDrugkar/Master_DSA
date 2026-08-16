package org.example.basics_of_java.maths;

public class ReverseNumber {
    public static void main(String[] args) {
        int reverse = 0;
        int num = 3456;
        while(num > 0){
            int lastDigit = num % 10;
            reverse = ( reverse * 10) + lastDigit;
            num = num / 10;
        }
        System.out.println(reverse);
    }
}

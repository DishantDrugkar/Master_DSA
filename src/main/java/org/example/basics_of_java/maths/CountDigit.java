package org.example.basics_of_java.maths;

public class CountDigit {
    public static void main(String[] args) {
        int num = 7789;
        int count = 0;
        while(num > 0){
            int lastDigit = num % 10;
            count++;
            num = num /10;
        }
        System.out.println(count);
    }
}

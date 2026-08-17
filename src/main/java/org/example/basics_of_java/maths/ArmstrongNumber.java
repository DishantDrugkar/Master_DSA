package org.example.basics_of_java.maths;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 371;
        int originalNumber = num;
        int sum = 0;

        while(num > 0){
            int lastDigit = num % 10;
            sum = sum + (lastDigit * lastDigit * lastDigit);
            num = num / 10;
        }

        if(originalNumber == sum){
            System.out.println("Armstrong Number");
        }else {
            System.out.println("Not a Armstrong Number");
        }
    }
}

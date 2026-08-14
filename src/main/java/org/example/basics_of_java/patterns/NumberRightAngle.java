package org.example.basics_of_java.patterns;

public class NumberRightAngle {
    public static void main(String[] args) {
        int count = 0;
        for(int i=0; i<5; i++){
            for(int j=0; j<=i; j++){
                System.out.print(" " + count++ + " ");
            }
            System.out.println();
        }
    }
}

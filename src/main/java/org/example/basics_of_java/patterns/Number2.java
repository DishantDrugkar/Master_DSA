package org.example.basics_of_java.patterns;

public class Number2 {
    public static void main(String[] args) {
        int count = 1;
        for(int i=0; i<5; i++){
            for(int j=0; j<=i; j++){
                System.out.print(" " + count++ + " ");
            }
            count = 1;
            System.out.println();
        }
    }
}

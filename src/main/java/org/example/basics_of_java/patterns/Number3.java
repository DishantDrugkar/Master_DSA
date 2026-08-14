package org.example.basics_of_java.patterns;

public class Number3 {
    public static void main(String[] args) {
        for(int i=1; i<5; i++){
            for(int j=1; j<=i; j++){
                System.out.print(" " + i + " ");
            }
            System.out.println();
        }
    }
}

package org.example.basics_of_java.patterns;

public class MirrorStar {
    public static void main(String[] args) {
        for(int i=1; i<=6; i++){
            for(int j=0; j<6-i+1; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}

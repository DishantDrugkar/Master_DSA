package org.example.basics_of_java.maths;

public class Gcd {
    public static void main(String[] args) {
        int N1 = 9;
        int N2 = 12;

        int gcd = 1;
        for(int i=1; i<=N1 && i<=N2; i++){
            if(N1 % i ==0 && N2 % i == 0){
                gcd = i;
            }
        }
        System.out.println("GCD : " + gcd);
    }
}

package org.example.basics_of_java.maths;

public class PrintAllDivisiors {
    public static void main(String[] args) {
        int num = 36;
        for(int i=1; i<=num ; i++){
            if(num % i == 0 ){
                System.out.print(i + " ");
            }
        }
    }
}

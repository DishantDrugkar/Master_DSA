package org.example.array.problems;

import java.util.Arrays;

public class Structure {
    public static void main(String[] args) {
        int arr[] = {5,1,3,2,6};

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        Arrays.sort(arr);
        System.out.println();
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

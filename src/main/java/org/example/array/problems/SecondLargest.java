package org.example.array.problems;

public class SecondLargest {
    public static void main(String[] args) {
        int arr[] = {5,3,2,8,1,8};
        System.out.println("Largest Element is : " + getLargest(arr));
        System.out.println("Second Largest Element is : " + getSecLargest(arr));
    }

    public static int getLargest(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
    }

    public static int getSecLargest(int arr[]){
        int largest = getLargest(arr);
        for(int i=0; i<arr.length; i++){
            if(arr[i] == largest){
                arr[i] = -1;
            }
        }
        int secMax = getLargest(arr);
        return secMax;
    }
}

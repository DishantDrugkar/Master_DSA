package org.example.array;

public class LargestElement {
    public static void main(String[] args) {
        int arr[] = {3,2,1,5,2};
        System.out.println("Largest Element is : " + getLargest(arr));
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
}

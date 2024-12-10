package com.arrays;
import java.util.Arrays;
public class bubble_sort {
    public static void main(String[] args) {
        int[] arr={13,46,24,52,20,9};
        int[] arr1={2,3,4,5,6,7};
        //bubble_sort(arr,arr.length);
        bubble_sort(arr1,arr1.length);
        System.out.println(Arrays.toString(arr1));
    }// including no swap determine that the array is already sorted and there is no need
    // to swap and stop the array for running n times
    static void bubble_sort(int[] arr,int n){
        int no_swap=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                    no_swap=1;
                }
                if(no_swap==1){
                    System.out.println("swaps");
                }
            }
        }
    }
    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}

package com.arrays;
import java.util.Scanner;
import java.util.Arrays;
public class selection {
    public static void main(String[] args){
        int[] arr={13,46,24,52,20,9};
        selection_sort(arr,arr.length);
        System.out.println((Arrays.toString(arr)));
    }
    static void selection_sort(int[] arr,int n){
        for(int i=0;i<=n-2;i++){
            int min=i;
            for(int j=i;j<n;j++){
                if(arr[j]<arr[min]) min=j;
            }
            swap(arr,i,min);
        }
    }
    static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

}

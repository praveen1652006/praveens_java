package com.arrays;
import java.util.Arrays;
import java.util.Scanner;
public class rotate_array_k {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int[] arr={1,2};
        System.out.println("enter how many times to rotate the array:");
        int k=obj.nextInt();
        rotate(arr,k);
    }

    static void rotate(int[] arr, int k) {
        int n=arr.length;
        k=k%n;
        int[] temp = new int[k+1];
        for(int i=0;i<=k;i++){
            temp[i]=arr[i];
        }
        int s=n-k;
        for(int i=n-k;i<n;i++){
            arr[i-s]=arr[i];
        }
        for(int i=k;i<n;i++){
            arr[i]=temp[i-k];
        }
        System.out.println(Arrays.toString(arr));
    }
}

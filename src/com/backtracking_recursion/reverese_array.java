package com.backtracking_recursion;
import java.util.Scanner;
import java.util.Arrays;
// reverse array without using reference variable
public class reverese_array {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextInt();
        }
        reverse(arr, 0, n);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverse(int[] arr, int i, int n) {
        if(i>n/2) return;
        swap(arr,i,n-i-1);
        reverse(arr,i+1,n);

    }

}


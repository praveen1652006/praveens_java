package com.arrays;
import java.util.Arrays;
import java.util.Scanner;
public class max_values {
    public static void main(String[] args) {
        int[] arr={5,9,67,0,5};
        max(arr,2,4);


    }// if we want to find the minimum and maximum values from the array from specifoc range just pass the starting postion and ending position in the function
    // the process were same only
    static void max(int[] arr,int x,int j) {
        if(arr.length==0 ||arr.length==1){
            System.out.println(-1);
        }
        int maxv = arr[0];
        int minv = arr[0];
        for (int i =x; i < arr.length; i++) {
            if (arr[i] > maxv) {
                maxv = arr[i];
            }
            else if (arr[i] < minv) {
                minv = arr[i];
            }
        }
        System.out.println(maxv+" "+minv);
    }
}

package com.arrays;
import java.util.Scanner;
import java.util.Arrays;
public class reverse_arr {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=obj.nextInt();
        int[] a=new int[n];
        for (int i=0;i<a.length;i++){
            a[i]=obj.nextInt();
        }
        rev(a);
        System.out.println(Arrays.toString(a));
    }
    static void rev(int[] arr){
        int i =0;
        int j=arr.length-1;
        while(j> i){
            swap(arr, i,j);
            i++;
            j--;
        }
    }
     static void swap(int[] arr,int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

}

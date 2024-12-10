package com.arrays;
import java.util.Arrays;
import java.util.Scanner;
public class swap_arr_elem {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int[] arr={1,2,3,4,99};
        swap(arr,0,4);
        System.out.print(Arrays.toString(arr));

    }
    static void swap(int[] arr,int i,int j){
        int temp;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}

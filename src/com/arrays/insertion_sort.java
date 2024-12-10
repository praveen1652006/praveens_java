package com.arrays;
import java.util.Arrays;
public class insertion_sort {
    public static void main(String[] args) {
        int[] arr={14,9,15,12,6,8,13};
        insertion_sort(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void insertion_sort(int[] arr,int n){
        for(int i=0;i<n;i++){
            int j=i;
            while(j>0&&arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                j--;
            }
        }
    }
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

}

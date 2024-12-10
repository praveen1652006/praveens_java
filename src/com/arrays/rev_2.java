package com.arrays;
import java.util.Scanner;
import java.util.Arrays;
public class rev_2 {
    public static void main(String[] args){
        Scanner obj=new Scanner (System.in);
        System.out.println("Enter the size of the array");
        int n=obj.nextInt();
        int k=n;
        int[] arr=new int[n];
        for(int x=0;x<n;x++){
            arr[x]=obj.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int[] brr=new int[k];
        int i=n-1;
        int j=0;
        while(i>=0){
            brr[j]=arr[i];
            i--;
            j++;
        }
        System.out.println(Arrays.toString(brr));

    }
}

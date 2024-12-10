package com.arrays;
import java.util.Scanner;
public class basics_arr {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=obj.nextInt();
        }
        arr[0]=2;
        // System.out.println(Arrays.toString(arr)) // for(any variable:arr){System.out.println(j," ")}
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
package com.arrays;
import java.util.Scanner;
import java.util.Arrays;
public class twoD_arr {
    public static void main(String[] args) {
       int[][] arr=new int[3][3];
        Scanner obj=new Scanner (System.in);
        for (int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                arr[row][col]=obj.nextInt();
            }
        }                                             // arr[row].length=size of the column
        for (int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                System.out.print(arr[row][col]);
            }
            System.out.println();
        }
        int[][] krr ={
                {1,2,3},
                {4,5,6,7,8,9,10},
                {7,8,9,}
        };
         for (int row=0;row<krr.length;row++){
            for(int col=0;col<krr[row].length;col++){
                System.out.print(krr[row][col]+" ");
            }
            System.out.println();
        }



    }
}

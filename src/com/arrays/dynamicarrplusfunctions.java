package com.arrays;
import java.util.Scanner;
import java.util.Arrays;
public class dynamicarrplusfunctions {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        Scanner obj = new Scanner(System.in);
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = obj.nextInt();
            }
        }
        for (int row = 0; row < arr.length; row++)      {      // arr[row].length=size of the column
            System.out.println(Arrays.toString(arr[row]));
        }
    }
}

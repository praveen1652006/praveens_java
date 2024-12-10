package com.arrays;
import java.util.Scanner;
import java.util.Arrays;
public class pass_arr_fun {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        String[] arr=new String[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=obj.next();
        }
        change(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void change(String [] num){
        num[1]="photoengrave";
        num[3]="im praveen";
        System.out.println(Arrays.toString(num));


    }
}

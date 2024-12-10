package com.hashing;
import java.util.Scanner;
import java.util.Arrays;
public class counting_occurences {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=obj.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int[] hash=new int[1000];
        // hash=
        for(int i=0;i<n;i++){
            hash[arr[i]]+=1;
        }
        // number of inputs
        int c=obj.nextInt();
        for(int i=0;i<5;i++){
            int k=obj.nextInt();
            System.out.println(hash[k]);
        }

    }
}
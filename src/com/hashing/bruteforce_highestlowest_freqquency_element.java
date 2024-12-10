package com.hashing;
import java.util.Scanner;
import java.util.Arrays;
public class bruteforce_highestlowest_freqquency_element {
    public static void main(String[] args) {
        int[] arr={2,3,2,4,2,5,10,9,8,10};
        boolean[] check=new boolean[arr.length];
        for(int i=0;i<arr.length;i++){
            if(check[i]==true){
                continue;
            }int c=0;
            for(int j=i+1;j<arr.length;j++){
                c++;
                if(arr[i]==arr[j]){
                    check[i]=true;
                }
            }
            System.out.println(arr[i]+"->"+c);
        }
    }
}

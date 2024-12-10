package com.basic_programs;
import java.util.Scanner;
public class FIBONACCI {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int x=obj.nextInt();
        /*int a=0,b=1;
        for (int i=2;i<=x;i++){
            int k=a+b;
            System.out.println(k);
            a=b;
            b=k;*/
        int a=0,b=1;
        int c=2;
        while(c<=x){
            int temp=a+b;
            System.out.println(temp);
            a=b;
            b=temp;
            c++;
        }


    }
}

package com.backtracking_recursion;
import java.util.Scanner;
public class printnumbers {
    static int k=1;
    //print numbers n to 1 using back tracking
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int i=1;
        //printnum(i,n);
        printnums(k,n);
    }// in the reverse order
    static void printnum(int i,int n){
        if(i>n) return;
        printnum(i+1,n);
        System.out.print(i+" ");
    }// in the straight order
    static void printnums(int k,int n){
        if(n<k) return;
        printnums(k,n-1);
        System.out.print(n+" ");
    }
}

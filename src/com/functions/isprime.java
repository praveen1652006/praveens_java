package com.functions;
import java.util.Scanner;
public class isprime {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        boolean k=isPrime(n);
        System.out.println(k);

    }
    static boolean isPrime(int n){
        int c=2;
        while(c*c<=n){
            if(n%c==0){
                return false;
            }c++;
        }
        return true;
    }
}

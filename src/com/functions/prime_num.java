package com.functions;
import java.util.Scanner;
public class prime_num {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("enter a  number:");
        int n=obj.nextInt();
        int k=prime(n);
        if(k==0||k==1){
            System.out.println("not a prime try different num:"+k);
        }
        else{
            System.out.println("it is a prime:"+k );
        }

    }
    static int prime(int n) {
        int c = 0;
        for (int i = 2; i < n/2; i++) {
            if (n % i == 0) {
                c++;
                break;
            }

        }
        if(c==1){
            return 0;
        }
        else{
            return n;
        }
    }
}
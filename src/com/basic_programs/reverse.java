package com.basic_programs;
import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int sum=0;
        while(a>0)
        {
            int rem=a%10;
            sum=(sum*10)+rem;
            a=a/10;
        }
        System.out.println(sum);
    }
}

package com.functions;
import java.util.Scanner;
public class sumoftwonums {
    public static void main(String[] args){
       sum();
       sum();
    }
    static void sum(){
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the first number");
        int num1=obj.nextInt();
        System.out.println("enter the second number");
        int num2=obj.nextInt();
        System.out.println("the sum is="+(num1+num2));




    }
}

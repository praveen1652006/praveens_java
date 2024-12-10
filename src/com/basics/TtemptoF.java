package com.basics;
import java.util.Scanner;
public class TtemptoF {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the temperature:");
        int temp=obj.nextInt();
        float fah=((float)(temp)*1.8f)+32;
        System.out.println("fahrenheit="+fah);

    }
}

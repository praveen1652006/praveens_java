package com.basic_programs;
import java.util.Scanner;
public class largestnumber {
    public static void main(String[] args) {
        //to find the largest number
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        int b = obj.nextInt();
        int c = obj.nextInt();
       /* int max =a;
            if(b>max){
                max=b;
            }
            if(c>max) {
                max = c;
            }
        System.out.println(max);

    }*/
        int max = 0;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        if (max > c) {
            System.out.println(max);
        } else {
            System.out.println(c);
        }
    }
}

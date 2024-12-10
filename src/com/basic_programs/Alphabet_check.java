package com.basic_programs;
import java.util.Scanner;
public class Alphabet_check {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        char ch=obj.next().trim().charAt(0);
        if(ch>='a' && ch<='z'){
            System.out.println("lowercase="+ch);
    }
        else{
            System.out.println("Upper case="+ch);
        }

    }
}

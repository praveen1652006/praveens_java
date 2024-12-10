package com.functions;
import java.util.Scanner;
public class greetings {
    public static void main(String[] args) {
       String k1=greetings();
       System.out.println(k1);
    }
    static String greetings(){
        Scanner obj=new Scanner (System.in);
        System.out.println("Hello  world!");
        String k=obj.nextLine();
        return k;


    }
}

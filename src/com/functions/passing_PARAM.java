package com.functions;
import java.util.Scanner;
public class passing_PARAM {
    /*public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter two numbers:");
        int n1=obj.nextInt();
        int n2=obj.nextInt();
        int k=sum(n1,n2);
        System.out.println(k);
    }
    static int sum(int n1,int n2){
        int n3=n1+n2;
        return n3;
        //System.out.println("sum"+n3);

    }*/
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter a message:");
        String k=obj.nextLine();
        String h=greetings(k);
        System.out.println(h);

    }
    static String greetings(String k){
        String k1="i";
        return k1;
    }
}

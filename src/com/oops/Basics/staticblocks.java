package com.oops.Basics;
class sb{
    static int a=5;
    static int b;
    static{
        b=10;
        System.out.println("Static block is executed");
    }
}
public class staticblocks {
    public static void main(String[] args) {
        sb one=new sb();
        System.out.println("1.class is loaded");
        System.out.println(sb.b);
        System.out.println("class is already loade so it cant be printed");
        System.out.println(sb.b+3);
    }
}

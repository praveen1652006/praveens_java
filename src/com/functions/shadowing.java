package com.functions;

public class shadowing {
    static int x=90;
    public static void main(String[] args){
        System.out.println(x);//90
        x=50;
        x=x+2;
        System.out.println(x);//52

    }
}

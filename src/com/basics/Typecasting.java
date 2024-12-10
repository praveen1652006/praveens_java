package com.basics;
public class Typecasting {
    public static void main(String[] args) {

        //type casting
        /*int n = (int)(53.99f);
        System.out.print(n);*/
        // automatic type promotions in expressions
      int a=258;// byte can only able to store till 256 numbers
       byte b=  (byte)(a);// typecasting int into byte it actually gives the modulo value of it --a%b=2
     System.out.println(b);

       // char number=67;
       // System.out.println(number);

        //byte b=42;
        char c='a';
        short s=1024;
        int i=5000;
        float f=5.67f;
        double d=0.1234;
        double result= (f*b)+(i/c)-(d*s);
        System.out.println((f*b)+"  "+(i/c)+"  "+(d*s));
        System.out.println(result);

    }
}

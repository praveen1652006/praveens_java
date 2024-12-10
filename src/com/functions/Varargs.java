package com.functions;
import java.util.Arrays;
public class Varargs {
    public static void main(String[] args){
        t("praveen");// with 0 arguement types
        t(2,3);// in this case we can pass more than or equal 0 arguements
        multiple(2,4,5);
    }
    static void multiple (int... x){
        System.out.println(Arrays.toString(x));
    }

    static void t(int... v) {
        // it considers v as implicitly declared as array as an type of string
         System.out.println(Arrays.toString(v));
    }
    static void t(String ... a){
        System.out.println(a);
    }
}

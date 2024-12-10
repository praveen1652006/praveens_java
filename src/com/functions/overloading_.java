package com.functions;
public class overloading_ {
    public static void main(String[] args) {
        function(5,5);
        function("Hello world!!");
    }
    static void function(int a,int b){
        System.out.println(a+b);

    }
    static void function(String a){
        System.out.println(a);
    }
}




/*what is function over_loading?
two or more functions have same name , if the passing parameters are different  data type
 */
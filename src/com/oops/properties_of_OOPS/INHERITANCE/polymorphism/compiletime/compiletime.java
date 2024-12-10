package com.oops.properties_of_OOPS.INHERITANCE.polymorphism.compiletime;
//compile time polymorphism(OVERLOADING)
public class compiletime {
    public int add(int a,int b){
        return a+b;
    }
    public int  add(int b,int a,int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        compiletime obj=new compiletime();
        System.out.println(obj.add(1,2,3));
    }
}

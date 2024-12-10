package com.oops.Basics;
// final keyword
public class Wrapperclasses {
    public static void main(String[] args) {
        final int a=10;
        final Integer A=10;
        System.out.println(A);
        family deva=new family("srinivasan","archana");
        final family praveen =new family(deva);
        System.out.println(praveen.f_name);
        family tharun;// variable declared
        for(int i=0;i<1000000000;i++){
            tharun =new family();
        }

    }
}
class family{
    String f_name;
    String m_name;
    family(family deva){
        this.f_name=deva.f_name;
    }
    family(){

    }
    family(String fath_name,String moth_name){
        this.f_name=fath_name;
        this.m_name=moth_name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("object is destroyed");
    }
}

package com.oops.Basics;
public class Innerclass {
    void inner() {
        System.out.println("innerclass");
    }
    static public class middle{
        void middle(){
            System.out.println("middleclass");
        }
    }
    public class outerclass {
        void outer() {
            System.out.println("outerclass");
        }
    }

    public static void main(String[] args) {
        Innerclass obj1=new Innerclass();
        obj1.inner();
        Innerclass.outerclass obj2=obj1.new outerclass();
        obj2.outer();
        middle obj3=new middle();
        obj3.middle();


    }
}
/*
public class outer{
        static class test{
        String name;
        test(String name){
        this.name=name;
        }
        }
 */

package com.oops.properties_of_OOPS.INHERITANCE.polymorphism.runtime;

public class Main {
    public static void main(String[] args) {
        shapes obj=new shapes(5);
//        circle obj1=new circle();
//        square obj2=new square();
//        triangle obj3=new triangle();
        //obj2.area();
        System.out.println(obj);
        // in this case a ref type of parent class and the object
        //is in the type of sub class
        // which method is to run will be depend on object type
        //what kind of method needs to access is determined by ref type
        //parent class
        // THE ABOVE METHOD IS ALSO CALLED AS UPCASTING


        //DYNAMIC METHOD DISPATCH happens in run time


    }
}

package com.oops.properties_of_OOPS.INHERITANCE.polymorphism.runtime;

public class triangle extends shapes {
    public triangle(int num) {
        super(num);
    }

    void area(){
        System.out.println("in triangle");
    }
}

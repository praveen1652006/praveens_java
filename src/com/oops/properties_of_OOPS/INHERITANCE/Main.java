package com.oops.properties_of_OOPS.INHERITANCE;

import com.oops.properties_of_OOPS.INHERITANCE.encapsulation_abstraction.accessmod;

public class Main {
    public static void main(String[] args) {
        //Box obj=new Box(99,98,97);
        //Box obj2=new Box(obj);
        //obj2.show();
        //Q1.how to print the both the properties from the superclass and the subclass
        //create a same function show same as in the super class,overrides it and
        //put a super keyword that in the subclass that calls the show in the super class
        //so super states 1 above class only
//        Boxweight obj1=new Boxweight(1000,1,2,3);
//        obj1.show();
        // if the user need to set the l,w,h from the child class
        //obj it is not possible only we can get only the default constructor value from the super class
        //we can able to only set the constructor for the properties inside the child class only
        // so if need to access the properties and we need to set the input from the super class from the class
        // object we can use super keyword

        //important:parent ref_variable=new child_object
        //case1:
        Box object=new Boxweight(100,2,3,6);
       // System.out.println(object.boxweight);
        // in this above case a object is referred to the type Box(parent_class has l,w,h)
        // and the object is created of child class(has all the properties of parent_class+boxweight)
        // hence therfore the reference type states that the properties in that can only be accessed
        //it does considers to have its same properties inthe child class and it can only be accesssed

        //case2:
        // Boxweight objectt=new Box();
        // the above line was wrong bcoz the reference type of child class cant be pointed
        // which it leads to error in the case the child expects all the properties that he
        // to be in the parent class, but the parent class doesnt know what it have

        /*
        important note:
        only upward access not downward access
         */
    //1.single inheritance
    //Boxprice obj=new Boxprice(100,200,3,4,5);
      Boxprice obj=new Boxprice(2,4,5);
    obj.show();
    //2.multilevel inheritance 1 one inherits another class and get continues
        // serially,in this every class will be a parent of another class
    //3.multiple inheritance-is not possible in java but it can be implemented using interfaces
    //4.hierarchical inheritance-one class gets inherited by many classes
    //5.hybrid inheritance hierarchical+multiple inheritance
        accessmod obj1=new accessmod(1,"devan");
        obj1.setN(6);
        obj1.print();








    }
}

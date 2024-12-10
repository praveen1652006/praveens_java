package com.oops.Basics;
//if the files are in the same we dont need to import it.
//lesson about static variable
public class Main {
    public static void main(String[] args){
        human obj=new human();
        human obj2=new human();
        human obj3=new human();
        obj.show();
        //human.greetings();

    }
}// main is declared as static bcoz
//non-static method need a object to run
//static method can accessible by using classname.static_method_name
//static refers to the class
//non-static refers to the object
class human{
    String name;
    int age;
    char gender;
    static long population;
    human(){
        // default constructor
        this.name="praveen";
        this.age=18;
        this.gender='M';
        human.population+=1;
    }
    void show(){
        System.out.println(this.name+":"+this.age+":"+this.gender+":"+human.population);
        greetings();
    }
    // static methods
    static void greetings(){
        System.out.println("hi guys!!");

    }
}
//note:
//1.a static member allowed in non-static method
//2.a non-static method not allowed in static method


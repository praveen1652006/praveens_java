package com.oops.Clone;

import java.util.Arrays;

public class labour implements Cloneable {
    public String name;
    private int age;
    public int[] arr={9,3,4,5,1};

    public labour(){

    }
   public labour(String name,int age){
        this.name=name;
        this.age=age;
    }
    public labour (labour other){
        this.name=other.name;
        this.age=other.age;
    }

    @Override
    public String toString() {
        return this.name+" "+this.age+" "+ Arrays.toString(arr);
    }
    public Object Clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

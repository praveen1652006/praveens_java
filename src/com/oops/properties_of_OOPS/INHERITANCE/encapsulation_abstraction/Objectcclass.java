package com.oops.properties_of_OOPS.INHERITANCE.encapsulation_abstraction;
public class Objectcclass {
    int num;
    String name;

    public Objectcclass(int i,String name) {
        this.num=i;
        this.name=name;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        Objectcclass one=new Objectcclass(34,"praveen");
        Objectcclass two=one;
        //if(one.name==two.name) System.out.println("true");
        //System.out.print(two.num);
        System.out.println(one instanceof Object);
        System.out.println(one.getClass());
    }
}

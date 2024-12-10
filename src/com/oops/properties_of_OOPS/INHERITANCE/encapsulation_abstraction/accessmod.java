package com.oops.properties_of_OOPS.INHERITANCE.encapsulation_abstraction;

public class accessmod {
     private int n;
    protected String name;
    protected int rno;
    public  accessmod(int num,String name,int rno){
        this.n=num;
        this.name=name;
        this.rno=rno;
    }

    public accessmod(int n, String name) {
    }

    //these are setters
    public int getN(){
        return n;
    }
    public void setN(int num){
        this.n=num;
    }
    public void print(){
        System.out.println(this.n+":"+this.name);
    }
}

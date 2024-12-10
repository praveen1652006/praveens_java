package com.oops.properties_of_OOPS.INHERITANCE.encapsulation_abstraction;

public class main extends accessmod {
    main(int n,String name,int rno){
        super(n,name,rno);
}
    public static void main(String[] args) {
        accessmod obj=new accessmod(1,"PRAVEEN",24);
        main obj1=new main(2,"devan",21);
        obj1.name="tharun";
        obj1.print();
    }
}

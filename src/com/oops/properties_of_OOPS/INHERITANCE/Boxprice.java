package com.oops.properties_of_OOPS.INHERITANCE;
public class Boxprice extends Boxweight {
    double price;
    Boxprice(){
        price=99.9;
    }
    Boxprice(double price){
        this.price=price;
    }
    Boxprice(int weight,double price,int l,int w,int h) {
        super(weight,l,w,h);
        this.price = price;
    }
    @Override
    public void show(){
        super.show();
        System.out.print(":"+this.price);
    }
    public Boxprice(int side,double price,int weight)
    {
        super(side,weight);
        this.price=price;
    }
}

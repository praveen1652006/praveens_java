package com.oops.properties_of_OOPS.INHERITANCE;

public class Boxweight extends Box{
     int boxweight;


    public Boxweight(){
        this.boxweight=100;
    }
    public Boxweight(int side,int weight ){
        super(side);
        this.boxweight=weight;
    }

    public Boxweight(Boxweight other){
        super(other);
        this.boxweight=other.boxweight;
    }
    public Boxweight(int weight,int l,int w,int h){
        super(h,l,w);
        this.boxweight=weight;
    }
    @Override
    public void show(){
        // this super calls the show function in the parent class
        super.show();
        //this print statement prints the box weight that been called from the
        //main function
        System.out.print(":"+this.boxweight);
    }

}

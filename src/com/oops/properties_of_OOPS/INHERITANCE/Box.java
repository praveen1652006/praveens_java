package com.oops.properties_of_OOPS.INHERITANCE;

public class Box {
    int l;
    private int w;
    private int h;
   public Box(){
        this.h=-1;
        this.w=-1;
        this.l=-1;
    }
    public Box(int side){
       this.h=side;
       this.l=side;
       this.w=side;
    }
    public Box(Box another){
        this.h=another.h;
        this.l=another.l;
        this.w=another.w;
    }
    public Box(int h,int l){
       this.l=l;
       this.h=h;
       this.w=0;
    }
    public Box(int h,int l,int w){
       this.h=h;
       this.l=l;
       this.w=w;
    }

    public void show(){
       System.out.print(this.h+":"+this.l+":"+this.w+":");
    }

}

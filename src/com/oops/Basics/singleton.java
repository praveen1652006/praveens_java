package com.oops.Basics;

public class singleton {
    int num;
    singleton(){

    }
     private static singleton instance;
     public static singleton getInstance(){
        if(instance==null){
            instance=new singleton();
        }
        return instance;
    }
}

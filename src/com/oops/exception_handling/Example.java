package com.oops.exception_handling;

public class Example {
    public static void main(String[] args) {
        int a=1,b=0;
        try{
            int divide=a/b;
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            {
                System.out.println("it executes always");
            }
        }
    }

}

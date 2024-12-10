package com.oops.interfaces.example_interface;

public class cdplayer implements player{
    @Override
    public void start() {
        System.out.println("music starts");
    }

    @Override
    public void stop() {
        System.out.println("music pause");
    }
}

package com.oops.interfaces.example_interface;

public class electric_engine implements engine{
    @Override
    public void start() {
        System.out.println("start as electric engine");
    }

    @Override
    public void stop() {
        System.out.println("stop as electric engine");

    }

    @Override
    public void accelerate() {
        System.out.println("accelerate as electric engine");

    }
}

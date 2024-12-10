package com.oops.interfaces.example_interface;

public class normalengine implements engine{
    @Override
    public void start() {
        System.out.println("normal engine starts");
    }

    @Override
    public void stop() {
        System.out.println("normal engine stops");
    }

    @Override
    public void accelerate() {
        System.out.println("accelerate normal engine");
    }
}

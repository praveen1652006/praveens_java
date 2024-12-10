package com.oops.interfaces.example_interface;

public class Car implements engine,brake,player {
// in this case i have been connected two interfaces in to one.
// so,i can access the methods in the interfaces
    //1.in this example it implements 3interfaces
    //the engine and the player has the same methods,start and stop
    //so,if I create a car from the car-class and when the start method is being
    //called from this it only starts the car not the media player
    // so in that case we have to create A separate classes for each interface
    @Override
    public void brake() {
        System.out.println("brake as normal");
    }

    @Override
    public void start() {
        System.out.println("start as normal car");
    }

    @Override
    public void stop() {
        System.out.println("stop as normal car");
    }

    @Override
    public void accelerate() {
        System.out.println("accelerate as normal car");
    }
}

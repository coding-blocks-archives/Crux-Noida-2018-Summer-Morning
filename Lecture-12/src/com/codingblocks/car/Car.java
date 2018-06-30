package com.codingblocks.car;

public class Car {

    private Engine engine = new Engine();

    public Car(){
        this.engine = new Engine();
    }

    public Car(Engine engine){
//        this.engine = engine;
    }

    public void start(){
        System.out.println("My car start");
        engine.start();
    }


    public void stop(){
        System.out.println("My car stop");
        engine.stop();
    }
}

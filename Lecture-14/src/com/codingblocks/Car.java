package com.codingblocks;

public class Car{

    private Engine engine;
    private Brake brake;

    private int seats;
    private int windows;

    public Car(){
        this.seats = 4;
        this.windows = 4;

        engine = new NitroEngine();
        brake = new AbsBrake();
    }

    public Car(Brake brake, Engine engine){
        this.seats = 4;
        this.windows = 4;

        this.engine = engine;
        this.brake = brake;
    }

    public int getSeats() {
        return seats;
    }

    public int getWindows() {
        return windows;
    }


    public void start(){
        engine.start();
    }


    public void stop() {
        brake.legBrake();
        engine.stop();
    }

    public void emergencyStop() {
        brake.handBrake();
        engine.stop();
    }

    protected void policy(){
        System.out.println("My insurance");
    }

    public void changeEngine(Engine engine){
        this.engine = engine;
    }

//    @Override
//    public void handBrake() {
//        System.out.println("Uncomfortable hand brake");
//    }
//
//    @Override
//    public void legBrake() {
//        System.out.println("Uncomfortable leg brake");
//    }
}

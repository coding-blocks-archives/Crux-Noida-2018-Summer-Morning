package com.codingblocks.inheritance;

public class Car {

    private int windows;
    public int seats;

    public Car(){
        this.windows = 4;
        this.seats = 4;
    }

    public void start(){
        System.out.println("I start loud");
    }

    public void start(boolean boost){
        System.out.println("I start loud " + boost);
    }

    public void stop(){
        System.out.println("I stop in fashion");
    }

    public void brake(){
        System.out.println("Mar gya mar gya");
    }

    public int getWindows() {
        return windows;
    }

    public int getSeats() {
        return seats;
    }

    protected void setWindows(int windows) {
        this.windows = windows;
    }
}

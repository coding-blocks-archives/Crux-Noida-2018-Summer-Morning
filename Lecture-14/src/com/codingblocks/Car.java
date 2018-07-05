package com.codingblocks;

public class Car {
    public int seats;
    private int windows;

    public Car(){
        this.seats = 4;
        this.windows = 4;
    }

    public int getSeats() {
        return seats;
    }

    public int getWindows() {
        return windows;
    }

    public void start(){
        System.out.println("boom");
    }

    protected void policy(){
        System.out.println("My insurance");
    }
}

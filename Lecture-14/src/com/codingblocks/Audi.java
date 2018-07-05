package com.codingblocks;

public class Audi extends Car {

    private int seats;
    private int windows;

    public Audi(){
        this.seats = 5;
        this.windows = 4;
    }

    public int getSeats() {
        return seats;
    }

    public void start() {
    }

    @Override
    public void policy() {
        super.policy();
    }
}

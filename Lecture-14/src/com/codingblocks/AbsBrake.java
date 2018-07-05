package com.codingblocks;

public class AbsBrake implements Brake {
    @Override
    public void handBrake() {
        System.out.println("Apply ABS handBrake");
    }

    @Override
    public void legBrake() {
        System.out.println("Apply ABS legBrake");
    }
}

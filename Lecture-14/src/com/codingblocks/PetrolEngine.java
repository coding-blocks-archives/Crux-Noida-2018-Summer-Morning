package com.codingblocks;

public class PetrolEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Petrol engine starting");
    }

    @Override
    public void stop() {
        System.out.println("Petrol engine stopping");
    }
}

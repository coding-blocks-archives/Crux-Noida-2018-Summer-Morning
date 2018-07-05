package com.codingblocks;

public class NitroEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Nitro engine starting");
    }

    @Override
    public void stop() {
        System.out.println("Nitro engine stopping");
    }
}

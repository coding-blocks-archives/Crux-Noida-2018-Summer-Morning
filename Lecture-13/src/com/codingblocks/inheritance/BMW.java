package com.codingblocks.inheritance;

public class BMW extends Car {

    public int seats = 5;

    public int whatever(){
        return 1;
    }

    @Override
    public void start() {
        System.out.println("But now I am BMW");
    }
}

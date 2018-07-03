package com.codingblocks;

public class Human {

    int hairs;
    int eyes;
    int hands;

    public Human(){
        hairs = 1000;
        eyes = 2;
        hands = 2;
    }

    public Human(int e){
        this.hairs = 1000;
        eyes = e;
        this.hands = 2;
    }



    public static void main(String[] args) {


        Human m = new Human(3);

        System.out.println(m.eyes);

        Human krish = new Human();

        System.out.println(krish.eyes);



    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}

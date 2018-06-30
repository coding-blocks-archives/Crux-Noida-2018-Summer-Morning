package com.codingblocks;

public class Human {

    public static int population = 0;

    int[] data = new int[100000];

    int amount;

    public Human(int amount){
        this.amount = amount;
        population++;
        System.out.println("Now we have human count : " + population);
    }

    public int charity(int amount){
        this.amount = this.amount - amount;
        System.out.println(" Yaar ab rah gye bas : " + this.amount);
        return amount;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        population--;
        System.out.println("Someone had to die. human count : " + population);
    }
}

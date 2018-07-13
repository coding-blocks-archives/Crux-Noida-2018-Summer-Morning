package com.codingblocks;

public class Human extends Object implements Comparable<Human>{

    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Human other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        String data = String.format("{%s : %d}", name, age);
        return data;
    }
}

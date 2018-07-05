package com.codingblocks;

// https://www.amazon.in/Core-Java-Vol-I-Fundamentals/dp/9332582718?tag=googinhydr18418-21&tag=googinkenshoo-21&ascsubtag=9acec81e-d5e2-4e2c-95e5-60a59d4ea545

public class Main {

    public static void main(String[] args) {
	// write your code here

        Engine engine = new PetrolEngine();
        Brake brake = new AbsBrake();

        Car my_car = new Car(brake, engine);

        my_car.start();

        my_car.stop();

        Engine e = new NitroEngine();
        my_car.changeEngine(e);

        my_car.start();

        my_car.stop();





    }
}

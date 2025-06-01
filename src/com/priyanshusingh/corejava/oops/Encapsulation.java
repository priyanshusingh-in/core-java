package com.priyanshusingh.corejava.oops;

public class Encapsulation {
    //Encapsulation is the practice of bundling data(fields)
    //and methods(functions) that operate on the data into a
    //single unit(class).
    //It also involves restricting direct access to some
    //components using access modifiers(e.g., private, protected).
    public static void main(String[] args) {
        Vehicles vehicle = new Vehicles("green");

        // will get an error as color and speed is private
        // vehicle.color = "blue";
        //vehicle.speed = 100;

        //changing speed through setSpeed() method
        vehicle.setSpeed(0);
        vehicle.printSpeed();
        vehicle.drive();
    }
}
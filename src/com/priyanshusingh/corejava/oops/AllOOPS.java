package com.priyanshusingh.corejava.oops;

// Object-Oriented Programming is a programming paradigm that uses objects and classes to design and implement software solutions.
// Class is a blueprint for creating objects. It defines the structure(fields) and behaviors(methods) of the object.
public class AllOOPS {
    public static void main(String[] args) {
        //creating an object(instance) of class Car
        Car obj = new Car();
        //An Object is an instance of a class. It represents a real-world entity and has attributes and behaviors.
        //attributes: fields
        obj.color = "Red";
        obj.speed = 100;
        //behaviors: methods
        obj.drive();
    }
}
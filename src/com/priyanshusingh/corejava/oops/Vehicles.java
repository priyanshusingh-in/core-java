package com.priyanshusingh.corejava.oops;

public class Vehicles {

    public Vehicles(String color) {
        this.color = color;
    }

    private int speed = 44;
    //preventing color from being changes in the future
    private String color = "Red";

    void drive() {
        System.out.println("Vehicle is driving");
    }

    public void setSpeed(int speed) {
        if(speed<=0) {
            System.out.println("Not Possible");
        } else {
            this.speed = speed;
            System.out.println("Driving at Speed: " + speed);
        }
    }

    public void applyBreaks() {
        System.out.println("Applying breaks");
        this.speed = 0;
    }

    public void printSpeed() {
        System.out.println("Speed: " + speed);
    }

}

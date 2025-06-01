package com.priyanshusingh.corejava.controlflow;

public class IfStatement {
    public static void main(String[] args) {
        boolean isSunny = true;
        boolean isWarm = true;

        if(isSunny && isWarm) {
            System.out.println("It's Beach Day!");
        } else {
            System.out.println("It's not a Beach Day!");
        }
    }
}

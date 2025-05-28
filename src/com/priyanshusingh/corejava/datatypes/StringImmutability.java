package com.priyanshusingh.corejava.datatypes;

public class StringImmutability {
    public static void main(String[] args) {
        String name = "John";
        name.toUpperCase();
        System.out.println(name); //Still prints "John"
        //Correct way
        name = name.toUpperCase();
        System.out.println(name); //Prints "JOHN"
    }
}

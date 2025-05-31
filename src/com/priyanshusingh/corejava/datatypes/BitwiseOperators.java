package com.priyanshusingh.corejava.datatypes;

public class BitwiseOperators {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        System.out.println(Integer.toBinaryString(a));

        //AND operator (&)
        System.out.println("AND OPERATOR: ");
        System.out.println("5 & 3 = " + (a & b));
        System.out.println("Binary: " + Integer.toBinaryString(a & b));

        //OR operator (|)
        System.out.println("OR OPERATOR: ");
        System.out.println("5 | 3 = " + (a | b));
        System.out.println("Binary: " + Integer.toBinaryString(a | b));

        //XOR operator (^)
        System.out.println("OR OPERATOR: ");
        System.out.println("5 ^ 3 = " + (a ^ b));
        System.out.println("Binary: " + Integer.toBinaryString(a ^ b));

        //NOT operator (~)
        System.out.println("NOT OPERATOR: ");
        System.out.println("~ 3 = " + (~a));
        System.out.println("BINARY: " + Integer.toBinaryString(~a));

        //LEFT SHIFT (<<)
        System.out.println("LEFT SHIFT OPERATOR: ");
        System.out.println("5 << 1 = " + (a << 1));
        System.out.println("Binary: " + Integer.toBinaryString(a << 1));

        //RIGHT SHIFT (>>)
        System.out.println("RIGHT SHIFT OPERATOR: ");
        System.out.println("5 >> 1 = " + (a >> 1));
        System.out.println("Binary: " + Integer.toBinaryString(a >> 1));


    }
}

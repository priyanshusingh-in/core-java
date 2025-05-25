package com.priyanshusingh.corejava.datatypes;

public class WideningConversion {
    public static void main(String[] args) {
        System.out.println("Widening Conversion(Implicit) Examples:");
        System.out.println("----------------------------------------");
        byte byteValue = 10; // 1 byte
        short shortValue = byteValue; // 2 byte
        int intValue = shortValue; // 4 byte
        long longValue = intValue; // 8 byte
        float floatValue = longValue; // 4 byte
        double doubleValue = floatValue; // 8 byte

        System.out.println("int: " + intValue);
        System.out.println("long: " + longValue);
        System.out.println("float: " + floatValue);
        System.out.println("double: " + doubleValue);
    }
}

package com.priyanshusingh.corejava.datatypes;

public class NarrowingConversion {
    public static void main(String[] args) {
        System.out.println("Narrowing Conversion(Explicit) Example:");
        System.out.println("-----------------------------------------");
        double doubleValue2 = 23.44434534534534;
        float floatValue2 = (float) doubleValue2;
        long longValue2 = (long) floatValue2;
        int intValue2 = (int) longValue2;
        System.out.println("double: " + doubleValue2);
        System.out.println("float: " + floatValue2);
        System.out.println("long: " + longValue2);
        System.out.println("int: " + intValue2);
    }
}

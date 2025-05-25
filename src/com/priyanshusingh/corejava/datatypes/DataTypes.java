package com.priyanshusingh.corejava.datatypes;

public class DataTypes {
    public static void main(String[] args) {
        System.out.println("Hello World");

        //Integral Numbers
        System.out.println("Byte Range: ");
        System.out.println("------------------");
        byte byteDataType = 122;
        System.out.println("Example byte value: " + byteDataType);
        System.out.println("Minimum byte value: " + Byte.MIN_VALUE);
        System.out.println("Maximum byte value: " + Byte.MAX_VALUE);

        int integerDataType = 434;
        short shortDataType = 443;
        long longDataType = 3094030580325083505L;

        //Decimal Numbers
        float floatDataType = 43.354F;
        double doubleDataType = 442.5434343434343434;

        //Boolean
        boolean isAdult = false;

        //Characters
        char gradeCharacter = 'A';
        System.out.println(gradeCharacter);
        System.out.println((int) gradeCharacter);
        //Print a heart
        System.out.println((char) 10084);
        System.out.println("Character Range: ");
        System.out.println("------------------");
        System.out.println("Minimum character value: " + (int) Character.MIN_VALUE);
        System.out.println("Maximum character value: " + (int) Character.MAX_VALUE);
        // Common ASCII examples (0-127 range)


    }
}

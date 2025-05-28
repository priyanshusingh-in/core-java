package com.priyanshusingh.corejava.datatypes;

public class StringOperations {
    public static void main(String[] args) {
        String text = "Hello World";

        //Length of the string
        System.out.println(text.length());

        //Accessing a character
        System.out.println(text.charAt(0));

        //Substring
        System.out.println(text.substring(0, 4));

        //Contains, startsWith, endsWith
        System.out.println(text.contains("World"));

        //Replace
        String newText = text.replace("world", "Java");

    }
}

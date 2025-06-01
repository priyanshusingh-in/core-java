package com.priyanshusingh.corejava.datatypes;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // same type of data and fixed size
        int[] numbers;
        //int numbers[];
        // int[] values = {1,3,4,34,535,34,2323,};

        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        numbers = new int[n];

        for(int i = 0; i < n; i++) {
            System.out.println("Enter element " + (i + 1) + ":");
            numbers[i] = sc.nextInt();
        }

        for(int number : numbers) {
            System.out.println(number);
        }
    }
}

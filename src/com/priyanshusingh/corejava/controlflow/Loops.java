package com.priyanshusingh.corejava.controlflow;

public class Loops {
    public static void main(String[] args) {
        //for loop
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }
        //enhanced for loop (for each loop)
        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            System.out.println("number = " + number);
        }
        //while loop
        int counter = 0;
        while (counter < 10) {
            System.out.println("counter = " + counter);
            counter++;
        }
        //do-while loop
        counter = 0;
        do {
            System.out.println("counter = " + counter);
            counter++;
        } while (
                counter < 10
        );
        //break and continue
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println("i = " + i);
        }
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
        }
    }
}

package com.priyanshusingh.corejava.datatypes;

public class ArithmeticOperators {
    public static void main(String[] args) {
        int a = 5 + 4;
        int b = 434 - 3;
        int c = 44 * 44;
        float d = 443 / 3.0f;
        double e = 10.0 / 3.0;
        int f = 10 % 3;
        System.out.println(d);

        a = a + 4;
        a += 4;
        System.out.println(a);

        // (Pre,Post) (Increment,Decrement) Operator
        a++;
        System.out.println(a);
        a--;
        System.out.println(a);
        ++a;
        System.out.println(a);
        --a;
        System.out.println(a);
    }
}

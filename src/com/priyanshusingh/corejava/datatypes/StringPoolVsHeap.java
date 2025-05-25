package com.priyanshusingh.corejava.datatypes;

public class StringPoolVsHeap {
    public static void main(String[] args) {
        //when 'new' jvm --> heap memory (String Pool to reuse String literals)
        StringPoolVsHeap test = new StringPoolVsHeap();
        StringPoolVsHeap test2 = new StringPoolVsHeap();

        //stack & heap(string pool)
        int a = 1; //stack
        String str1 = "Hello"; //heap(string pool)
        String str2 = "Hello"; //reusing literal from the string pool to save time and memory
        String str3 = new String("Hello");

        System.out.println(str1 == str2); //true (same reference in pool)
        System.out.println(str1 == str3); //false (different objects)
        System.out.println(str1.equals(str3)); //true (same content)


    }
}

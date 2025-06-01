package com.priyanshusingh.corejava.oops;
//Note: Java does not support Multiple inheritance
public class Inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat("Dog");
        dog.bark();
    }
}

//Single inheritance
class Animal {
    void eat(String animalName) {
        System.out.println(animalName+" is eating");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

//Multilevel inheritance
class GrandParents {

}

class Parents extends GrandParents {

}

class Children extends Parents {

}

//Hierarchical inheritance
class Brands {

}

class Honda extends Brands {

}

class Dell extends Brands {

}


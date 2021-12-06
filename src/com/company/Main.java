package com.company;

import com.company.Animals.Cat;
import com.company.Animals.Dog;
import com.company.L001.HelloWorld;
import com.company.L002.POJO;

public class Main {

    public static void main(String[] args) {
//        HelloWorld.run();
//        POJO.run();
//
//        Cat cat = new Cat();
//        cat.voice();
//
//        com.company.L004.Cat cat004 = new com.company.L004.Cat();
//        cat004.voice();

        Cat cat = new Cat("Barsik", 20);
        System.out.println(cat.jumpHeight());

        Dog dog = new Dog();
        dog.goToStick(14);
        dog.whereTheDog();
        dog.goToStick(20);
        dog.whereTheDog();
        dog.goToStick(5);
        dog.whereTheDog();

        Dog homeLessDog = Dog.ofHomeLess(10);
    }
}

package com.company;

import com.company.Animals.Cat;
import com.company.Animals.Dog;
import com.company.Animals.Duck;
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
        cat.voice();

        Dog dog = new Dog();
        dog.goToStick(14);
        dog.whereTheDog();
        dog.goToStick(20);
        dog.whereTheDog();
        dog.goToStick(5);
        dog.whereTheDog();

        Dog homeLessDog = Dog.ofHomeLess(10);
        homeLessDog.voice();

        Duck duck = new Duck();
        duck.voice();

        duck.takeOff();
        duck.isTheBirdFlying();
        duck.showSpeed();

        duck.lending();
        duck.isTheBirdFlying();
        duck.showSpeed();

        Dog[] dogHomeLess = new Dog[]{
                Dog.ofHomeLess(5),
                Dog.ofHomeLess(8),
                Dog.ofHomeLess(12),
        };
        System.out.println(dogHomeLess.length);
        System.out.println(dogHomeLess[0]);
        System.out.println(dogHomeLess[1]);
        System.out.println(dogHomeLess[2]);

        Dog[] dogs = Dog.randomArray();

        System.out.println(dogs[0]);
        System.out.println(dogs[1]);
        System.out.println(dogs[2]);

    }
}

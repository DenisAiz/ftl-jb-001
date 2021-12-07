package com.company;

import com.company.Animals.Cat;
import com.company.Animals.Dog;
import com.company.Animals.Duck;
import com.company.Animals.MoveType;
import com.company.L019.StringExample;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

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

        List<Dog> listDog = Dog.randomArray();
        for (int i = 0; i < listDog.size(); i++){
            System.out.println(listDog.get(i));
        }

        List<Dog> dogHomeLess = Arrays.asList(new Dog[] {
                Dog.ofHomeLess(5),
                Dog.ofHomeLess(8),
                Dog.ofHomeLess(12),
        });

        System.out.println(dogHomeLess.size());
        for (Dog dogItem : dogHomeLess){
            System.out.println(dogItem);
            dogItem.setName(String.valueOf(new Random().nextLong()));
            System.out.println(dogItem.getName());
        }

        List<Dog> dogLinkedList = new LinkedList<>();

        dogLinkedList.add(Dog.ofHomeLess(10));
        dogLinkedList.add(Dog.ofHomeLess(10));
        dogLinkedList.add(Dog.ofHomeLess(10));
        dogLinkedList.add(Dog.ofHomeLess(10));

        int indexLinkedList = 0;
        while (indexLinkedList < dogLinkedList.size()){
            System.out.println(dogLinkedList.get(indexLinkedList));
            indexLinkedList++;
        }

        for (int i = 0; i < 100; i++){
            //SwitchExample.run();
        }

        System.out.println(duck.getMoveType());
        System.out.println(dog.getMoveType().getValue());

        if (dog.getMoveType() == MoveType.WALK){
            System.out.println("Может ходить");
        }

        StringExample.run();
    }
}

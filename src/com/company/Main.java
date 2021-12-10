package com.company;

import com.company.Animals.*;
import com.company.L019.StringExample;
import com.company.L020.TypeConversion;
import com.company.L026.FileExample;
import com.company.L027.ThreadExample;
import com.company.L028.House;
import com.company.Tasks.Task001.Numbers;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws Exception{
//        HelloWorld.run();
//        POJO.run();
//
//        Cat cat = new Cat();
//        cat.voice();
//
//        com.company.L004.Cat cat004 = new com.company.L004.Cat();
//        cat004.voice();

        Cat cat = new Cat("Barsik", new Animal.AnimalWeight(3, Animal.AnimalWeight.WeightType.KG));
        System.out.println(cat.jumpHeight());
        cat.voice();

        Dog dog = new Dog();
        dog.goToStick(14);
        dog.whereTheDog();
        dog.goToStick(20);
        dog.whereTheDog();
        dog.goToStick(5);
        dog.whereTheDog();

        Dog homeLessDog = Dog.ofHomeLess(new Animal.AnimalWeight(10, Animal.AnimalWeight.WeightType.KG));
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
                Dog.ofHomeLess(new Animal.AnimalWeight(3, Animal.AnimalWeight.WeightType.KG)),
                Dog.ofHomeLess(new Animal.AnimalWeight(8, Animal.AnimalWeight.WeightType.KG)),
                Dog.ofHomeLess(new Animal.AnimalWeight(12, Animal.AnimalWeight.WeightType.KG)),
        });

        System.out.println(dogHomeLess.size());
        for (Dog dogItem : dogHomeLess){
            System.out.println(dogItem);
            dogItem.setName(String.valueOf(new Random().nextLong()));
            System.out.println(dogItem.getName());
        }

        List<Dog> dogLinkedList = new LinkedList<>();

        dogLinkedList.add(Dog.ofHomeLess(new Animal.AnimalWeight(10, Animal.AnimalWeight.WeightType.KG)));
        dogLinkedList.add(Dog.ofHomeLess(new Animal.AnimalWeight(10, Animal.AnimalWeight.WeightType.KG)));
        dogLinkedList.add(Dog.ofHomeLess(new Animal.AnimalWeight(10, Animal.AnimalWeight.WeightType.KG)));
        dogLinkedList.add(Dog.ofHomeLess(new Animal.AnimalWeight(10, Animal.AnimalWeight.WeightType.KG)));

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

        TypeConversion.run();

        dog.setWeight(new Animal.AnimalWeight(10, Animal.AnimalWeight.WeightType.KG));
        try {
            dog.getWeight().setValue(-10);
        }catch (Animal.WeightException ignore){
        }

        FileExample.run();
        ThreadExample.run();

        House house = new House.Builder()
                .otpHasSwimmingPool(true)
                .build();
        System.out.println(house.toString());

        House house1 = new House.Builder()
                .otpHasFancyStatues(true)
                .otpHasGarage(true)
                .otpHasGarden(true)
                .otpHasSwimmingPool(true)
                .build();
        System.out.println(house1.toString());

        Numbers.run();
    }
}

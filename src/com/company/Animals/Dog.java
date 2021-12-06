package com.company.Animals;

import java.util.ArrayList;
import java.util.List;

public class Dog extends Animal{
    public Dog(String name, Integer weight) {
        super(name, weight);
    }

    public Dog() {
        this.canFly = false;
    }

    /**
     * Определяем ранизу между текущей позицией и позицией палки.
     */

    public static List<Dog> randomArray(){
        List<Dog> dogs = new ArrayList<>();

        dogs.add(Dog.of("Shram", 10));
        dogs.add(Dog.of("Sharik", 7));
        dogs.add(Dog.of("Boris", 22));

        return dogs;
    }

    public void goToStick(Integer stickPosition){
        Integer delta = stickPosition - this.currentPosition;

        this.runForward(delta);
    }

    public void whereTheDog(){
        System.out.println(this.currentPosition);
    }

    public static Dog of(String name, Integer weight){
        return new Dog(name, weight);
    }

    public static Dog ofHomeLess(Integer weight){
        Dog dog = new Dog();
        dog.weight = weight;
        return dog;
    }

    @Override
    public void voice() {
        System.out.println("guf");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", currentPosition=" + currentPosition +
                '}';
    }
}

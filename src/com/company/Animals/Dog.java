package com.company.Animals;

import java.util.ArrayList;
import java.util.List;

public class Dog extends Animal{
    public Dog(String name, AnimalWeight weight) {
        super(name, weight, MoveType.WALK);
    }

    public Dog() {
        super(MoveType.WALK);
    }

    /**
     * Определяем ранизу между текущей позицией и позицией палки.
     */

    public static List<Dog> randomArray(){
        List<Dog> dogs = new ArrayList<>();

        dogs.add(Dog.of("Shram", new AnimalWeight(10, AnimalWeight.WeightType.KG)));
        dogs.add(Dog.of("Sharik", new AnimalWeight(7, AnimalWeight.WeightType.KG)));
        dogs.add(Dog.of("Boris", new AnimalWeight(22, AnimalWeight.WeightType.KG)));

        return dogs;
    }

    public void goToStick(Integer stickPosition){
        Integer delta = stickPosition - this.currentPosition;

        this.runForward(delta);
    }

    public void whereTheDog(){
        System.out.println(this.currentPosition);
    }

    public static Dog of(String name, AnimalWeight weight){
        return new Dog(name, weight);
    }

    public static Dog ofHomeLess(AnimalWeight weight){
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

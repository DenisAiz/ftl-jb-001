package com.company.Animals;

public class Dog extends Animal{
    public Dog(String name, Integer weight) {
        super(name, weight);
    }

    public Dog() {
    }

    /**
     * Определяем ранизу между текущей позицией и позицией палки.
     */

    public static Dog[] randomArray(){
        Dog[] dog = new Dog[3];
        dog[0] = Dog.of("Shram", 10);
        dog[1] = Dog.of("Sharik", 7);
        dog[2] = Dog.of("Boris", 22);

        return dog;
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

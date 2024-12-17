// 1. Problem Statement 1: Create a base class called `Animal` with a method `makeSound()`. Implement subclasses `Dog` and `Cat` that override this method to provide specific sounds for each animal (e.g., "Bark" for Dog and "Meow" for Cat). Write a program to demonstrate polymorphism by calling the `makeSound()` method on an array of `Animal` references.



class Animal{
    public void makeSound(){
        System.out.println("\"Some generic animal sound\" ");
    }
}

class Dog extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Dog: Bark");
    }
}

class Cat extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Cat: Meow");

    }
}

public class Animal_Sound {
    public static void main(String[] args) {
        // Animal animal = null;

        // animal = new Dog();
        // animal.makeSound();

        // animal = new Cat();
        // animal.makeSound();

        Animal [] animals = new Animal[2];

        animals[0] = new Dog();
        animals[1] = new Cat();

        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}

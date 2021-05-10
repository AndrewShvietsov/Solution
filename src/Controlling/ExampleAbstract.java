package Controlling;

public class ExampleAbstract {
    public static void main(String[] args) {
        System.out.println(Animable.war);
        Animal animal = new Animal() {
            @Override
            public void eating() {
                System.out.println("I'm eating");
            }
        };

        Animal dog = new Dog();
    }
}

abstract class Animal {
    int age;
    String name;

    public Animal(String name, int age) {
        this();
        this.name = name;
        this.age = age;
    }
    public Animal() {
        System.out.println("Default constructor is working");
    }

    public abstract void eating();
    public void growUp() {
        System.out.println("I'm growing");
    }
}

class Dog extends Animal{


    @Override
    public void eating() {

    }
}

interface Animable {
    int war = 35;
    public void eating();
    default public void growUp() {
        System.out.println("I'm growing");
    }
}
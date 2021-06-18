package main.block01.lesson06.pet;

import main.block01.lesson06.Animal;

public class Dog extends Animal {

    public Dog() {
        super("Собака");
    }

    @Override
    public String toString() {
        String voice = "гавкать.";
        return super.toString() + "домашнее животное, она умеет " + voice;
    }
}
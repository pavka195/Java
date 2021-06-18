package main.block01.lesson06.pet;

import main.block01.lesson06.Animal;

public class Cat extends Animal {

    public Cat() {
        super("Кошка");
    }

    @Override
    public String toString() {
        String voice = "мяукать.";
        return super.toString() + "домашнее животное, она умеет " + voice;
    }
}

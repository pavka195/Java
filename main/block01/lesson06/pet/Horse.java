package main.block01.lesson06.pet;

import main.block01.lesson06.Animal;

public class Horse extends Animal {

    public Horse() {
        super("Лошадь");
    }

    @Override
    public String toString() {
        String voice = "ржать.";
        return super.toString() + "домашнее животное, она умеет " + voice;
    }
}


package main.java.synergy.block01.lesson06.pet;

import main.java.synergy.block01.lesson06.Animal;

public class Cow extends Animal {

    public Cow() {
        super("Корова");
    }

    @Override
    public String toString() {
        String voice = "мычать.";
        return super.toString() + "домашнее животное, она умеет " + voice;
    }
}
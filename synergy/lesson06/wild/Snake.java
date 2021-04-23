package synergy.lesson06.wild;

import synergy.lesson06.Animal;

public class Snake extends Animal {

    public Snake(String animal) {
        super(animal);
    }

    @Override
    public String toString() {
        String voice = "шипеть.";
        return super.toString() + "дикое животное, она умеет " + voice;
    }
}
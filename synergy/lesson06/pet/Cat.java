package synergy.lesson06.pet;

import synergy.lesson06.Animal;

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

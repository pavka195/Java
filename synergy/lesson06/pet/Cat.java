package synergy.lesson06.pet;

import synergy.lesson06.Animal;

public class Cat extends Animal {

    public Cat(String animal) {
        super(animal);
    }

    @Override
    public String toString() {
        String voice = "мяукать.";
        return super.toString() + "домашнее животное, она умеет " + voice;
    }
}

package synergy.lesson06.pet;

import synergy.lesson06.Animal;

public class Dog extends Animal {

    public Dog(String animal) {
        super(animal);
    }

    @Override
    public String toString() {
        String voice = "гавкать.";
        return super.toString() + "домашнее животное, она умеет " + voice;
    }
}
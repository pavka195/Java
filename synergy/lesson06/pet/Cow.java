package synergy.lesson06.pet;

import synergy.lesson06.Animal;

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
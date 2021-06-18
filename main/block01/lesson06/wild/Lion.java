package main.block01.lesson06.wild;

import main.block01.lesson06.Animal;

public class Lion extends Animal {

    public Lion() {
        super("Лев");
    }

    @Override
    public String toString() {
        String voice = "рычать.";
        return super.toString() + "дикое животное, он умеет " + voice;
    }
}

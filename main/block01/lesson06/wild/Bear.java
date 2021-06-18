package main.block01.lesson06.wild;

import main.block01.lesson06.Animal;

public class Bear extends Animal {

    public Bear() {
        super("Медведь");
    }

    @Override
    public String toString() {
        String voice = "реветь.";
        return super.toString() + "дикое животное, он умеет " + voice;
    }
}

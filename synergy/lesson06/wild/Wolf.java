package synergy.lesson06.wild;

import synergy.lesson06.Animal;

public class Wolf extends Animal {

    public Wolf() {
        super("Волк");
    }

    @Override
    public String toString() {
        String voice = "выть.";
        return super.toString() + "дикое животное, он умеет " + voice;
    }
}

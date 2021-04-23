package synergy.lesson06.wild;

import synergy.lesson06.Animal;

public class Bear extends Animal {

    public Bear(String animal) {
        super(animal);
    }

    @Override
    public String toString() {
        String voice = "реветь.";
        return super.toString() + "дикое животное, он умеет " + voice;
    }
}

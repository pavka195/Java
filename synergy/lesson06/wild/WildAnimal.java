package synergy.lesson06.wild;

import synergy.lesson06.Animal;

public class WildAnimal extends Animal {
    private String type = "дикое животное,";

    public WildAnimal(String animal) {
        super(animal);
    }

    @Override
    public void voice() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return super.toString() + type;
    }
}
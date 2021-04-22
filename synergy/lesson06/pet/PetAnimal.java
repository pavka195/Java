package synergy.lesson06.pet;

import synergy.lesson06.Animal;

public class PetAnimal extends Animal {
    private String type = "домашнее животное,";

    public PetAnimal(String animal) {
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
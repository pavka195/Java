package main.block01.lesson06;

public class Animal {
    private final String animal;

    public Animal(String animal) {
        this.animal = animal;
    }

    public void voice() {
        System.out.println(toString());
    }

    public String toString() {
        return animal  + " - ";
    }
}
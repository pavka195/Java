package main.java.synergy.block01.lesson06;

import main.java.synergy.block01.lesson06.pet.*;
import main.java.synergy.block01.lesson06.wild.*;

import java.util.ArrayList;
import java.util.List;


public class Solution {
    public static void main(String[] args) {
        List<Animal> animalsList = new ArrayList<>();
        animalsList.add(new Cat());
        animalsList.add(new Dog());
        animalsList.add(new Cow());
        animalsList.add(new Horse());
        animalsList.add(new Bear());
        animalsList.add(new Lion());
        animalsList.add(new Snake());
        animalsList.add(new Wolf());
        for (Animal animals : animalsList) {
            animals.voice();
        }
    }
}
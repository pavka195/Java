package main.block01.lesson06;

import main.block01.lesson06.pet.Cat;
import main.block01.lesson06.pet.Cow;
import main.block01.lesson06.pet.Dog;
import main.block01.lesson06.pet.Horse;
import main.block01.lesson06.wild.Bear;
import main.block01.lesson06.wild.Lion;
import main.block01.lesson06.wild.Snake;
import main.block01.lesson06.wild.Wolf;
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
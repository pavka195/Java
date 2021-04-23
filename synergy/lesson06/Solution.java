package synergy.lesson06;

import synergy.lesson06.pet.*;
import synergy.lesson06.wild.*;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List<Animal> animalsList = new ArrayList<>();
        animalsList.add(new Cat("Кошка"));
        animalsList.add(new Dog("Собака"));
        animalsList.add(new Cow("Корова"));
        animalsList.add(new Horse("Лошадь"));
        animalsList.add(new Bear("Медведь"));
        animalsList.add(new Lion("Лев"));
        animalsList.add(new Snake("Змея"));
        animalsList.add(new Wolf("Волк"));
        for (Animal animals : animalsList) {
            animals.voice();
        }
    }
}
package synergy.lesson06.pet;

public class Cat extends PetAnimal {
    private String voice = "мяукать.";

    public Cat(String animal) {
        super(animal);
    }

    @Override
    public String toString() {
        return super.toString() + " она умеет " + voice;
    }
}

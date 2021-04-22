package synergy.lesson06.pet;

public class Dog extends PetAnimal {
    private String voice = "гавкать.";

    public Dog(String animal) {
        super(animal);
    }

    @Override
    public String toString() {
        return super.toString() + " она умеет " + voice;
    }
}
package synergy.lesson06.pet;

public class Horse extends PetAnimal {
    private String voice = "ржать.";

    public Horse(String animal) {
        super(animal);
    }

    @Override
    public String toString() {
        return super.toString() + " она умеет " + voice;
    }
}


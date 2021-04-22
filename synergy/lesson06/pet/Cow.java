package synergy.lesson06.pet;

public class Cow extends PetAnimal {
    private String voice = "мычать.";

    public Cow(String animal) {
        super(animal);
    }

    @Override
    public String toString() {
        return super.toString() + " она умеет " + voice;
    }
}
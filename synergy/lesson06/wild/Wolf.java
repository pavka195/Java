package synergy.lesson06.wild;

public class Wolf extends WildAnimal {
    private String voice = "выть.";

    public Wolf(String animal) {
        super(animal);
    }

    @Override
    public String toString() {
        return super.toString() + " он умеет " + voice;
    }
}

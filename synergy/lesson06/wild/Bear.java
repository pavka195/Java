package synergy.lesson06.wild;

public class Bear extends WildAnimal {
    private String voice = "реветь.";

    public Bear(String animal) {
        super(animal);
    }

    @Override
    public String toString() {
        return super.toString() + " он умеет " + voice;
    }
}

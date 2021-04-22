package synergy.lesson06.wild;

public class Lion extends WildAnimal {
    private String voice = "рычать.";

    public Lion(String animal) {
        super(animal);
    }

    @Override
    public String toString() {
        return super.toString() + " он умеет " + voice;
    }
}
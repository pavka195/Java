package synergy.lesson06.wild;

public class Snake extends WildAnimal {
    private String voice = "шипеть.";

    public Snake(String animal) {
        super(animal);
    }

    @Override
    public String toString() {
        return super.toString() + " она умеет " + voice;
    }
}

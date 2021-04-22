package synergy.lessons07.sportsman;

public class Human implements Sportsman {
    private final String name;
    private final int distance;
    private final int height;

    public Human(String name, int distance, int height) {
        this.name = name;
        this.distance = distance;
        this.height = height;
    }

    @Override
    public void run() {
        System.out.println("Спортсмен " + this.name + " пробежал " + this.distance + " м.");
    }

    @Override
    public void jump() {
        System.out.println("Спортсмен " + this.name + " прыгнул на " + this.height + " м.");
    }

    @Override
    public int trackLength() {
        return this.distance;
    }

    @Override
    public int wallHeight() {
        return this.height;
    }

    @Override
    public String nameSportsman() {
        return this.name;
    }
}
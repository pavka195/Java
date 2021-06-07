package main.java.synergy.block02.lesson14;

public class Digit implements HasValue {

    @Even(value = -1, message = "It's odd value")
    int value;

    public Digit(int i) {

    }

    @Override
    public int getValue() {
        return 0;
    }

    public void increment(@Even(0) int incrementedValue) {
        this.value += incrementedValue;
    }

}
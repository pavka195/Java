package main.java.synergy.block02.lesson12;

public class CustomRuntimeException extends RuntimeException {

    public CustomRuntimeException() {
        super("Custom exception happens during execution");
    }
}
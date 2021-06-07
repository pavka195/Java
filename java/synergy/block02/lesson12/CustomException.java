package main.java.synergy.block02.lesson12;

public class CustomException extends Exception {

    public String getLocalizedMessage;

    public CustomException(String message){
        super(message);
    }

    public CustomException(){
        super("Exception happens because of some problems");
    }
}

package main.block01.lesson08;

public interface Converter {

    double convert(double request);

    static Converter getConverter(Temperature temperature) {
        return temperature.getConverter();
    }
}

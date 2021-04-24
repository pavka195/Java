package synergy.lesson08;

public interface Converter {

    double convert(double request);

    static Converter getConverter(Temperature temperature) {
        return temperature.getConverter();
    }
}

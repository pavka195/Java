package synergy.lesson08.converters;

import synergy.lesson08.Converter;

public class FarToKelvyConverter implements Converter {
    @Override
    public double convert(double request) {
        return (request + 459.67)/ 1.8;
    }
}



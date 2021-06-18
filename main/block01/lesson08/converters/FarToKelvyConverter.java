package main.block01.lesson08.converters;

import main.block01.lesson08.Converter;

public class FarToKelvyConverter implements Converter {
    @Override
    public double convert(double request) {
        return (request + 459.67)/ 1.8;
    }
}



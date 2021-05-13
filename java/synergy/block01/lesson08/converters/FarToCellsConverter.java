package main.java.synergy.block01.lesson08.converters;

import main.java.synergy.block01.lesson08.Converter;

public class FarToCellsConverter implements Converter {
    @Override
    public double convert(double request) {
        return (request - 32) / 1.8;
    }
}

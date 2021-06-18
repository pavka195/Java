package main.block01.lesson08.converters;

import main.block01.lesson08.Converter;

public class KelvyToCellsConverter implements Converter {
    @Override
    public double convert(double request) {
        return request - 273.15;
    }
}

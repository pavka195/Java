package main.block01.lesson08.converters;

import main.block01.lesson08.Converter;

public class CellsToFarConverter implements Converter {
    @Override
    public double convert(double request) {
        return request * 1.8 + 32;
    }
}

package synergy.lesson08.converters;

import synergy.lesson08.Converter;

public class KelvyToFarConverter implements Converter {
    @Override
    public double convert(double request) {
        return request * 1.8 - 459.67;
    }
}

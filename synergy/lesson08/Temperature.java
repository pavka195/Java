package synergy.lesson08;


import synergy.lesson08.converters.*;

public enum Temperature {
    CELLS_FAR(new CellsToFarConverter()),
    CELLS_KELVIN(new CellsToKelvyConverter()),
    FAR_CELLS(new FarToCellsConverter()),
    FAR_KELVIN(new FarToKelvyConverter()),
    KELVIN_CELLS(new KelvyToCellsConverter()),
    KELVIN_FAR(new KelvyToFarConverter());

    private final Converter converter;

    Temperature(Converter converter) {
        this.converter = converter;
    }

    public Converter getConverter() {
        return this.converter;
    }

}


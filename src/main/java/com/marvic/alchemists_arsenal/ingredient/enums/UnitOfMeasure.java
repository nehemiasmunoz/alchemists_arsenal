package com.marvic.alchemists_arsenal.ingredient.enums;

import jakarta.persistence.Embeddable;

@Embeddable
public enum UnitOfMeasure {

    // Mass
    GRAM("g"), KILOGRAM("kg"), MILLIGRAM("mg"), TONNE("t"),
    POUND("lb"), OUNCE("oz"),

    // Volume
    LITER("L"), MILLILITER("mL"), CUBIC_METER("m³"),
    CUBIC_CENTIMETER("cm³"),

    // Temperature
    CELSIUS("°C"), FAHRENHEIT("°F"), KELVIN("K"),

    // Length
    METER("m"), CENTIMETER("cm"), KILOMETER("km"),
    INCH("in"), FOOT("ft"), MILE("mi"),

    // Time
    SECOND("s"), MINUTE("min"), HOUR("h"),

    // Pressure
    PASCAL("Pa"), ATMOSPHERE("atm"), BAR("bar"), TORR("Torr"),

    // Amount of Substance
    MOLE("mol"),

    // Concentration
    MOLAR("M"), MOLARITY("M"),

    // Energy
    JOULE("J"), KILOJOULE("kJ"), CALORIE("cal"),

    // Force
    NEWTON("N");

    private final String symbol;

    UnitOfMeasure(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }
}

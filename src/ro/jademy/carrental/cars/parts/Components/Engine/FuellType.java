package ro.jademy.carrental.cars.parts.Components.Engine;

public enum FuellType {
    GAS ("Gasoline"),
    DIESEL("Diesel"),
    ELECTRIC("Electric");

    private String fuelType;

    FuellType(String fuelName) {
        this.fuelType = fuelName;
    }

    public String getName() {
        return fuelType;
    }


}
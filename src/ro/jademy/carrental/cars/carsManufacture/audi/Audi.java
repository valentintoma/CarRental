package ro.jademy.carrental.cars.carsManufacture.audi;

import ro.jademy.carrental.cars.Car;
import ro.jademy.carrental.cars.parts.Components.GearBox;
import ro.jademy.carrental.cars.parts.Components.engine.Engine;

import java.math.BigDecimal;

public  class Audi extends Car {


    public Audi( String model, Integer year, String color, Engine engine, GearBox gearBox, Boolean isRented, BigDecimal price) {
        super ( "Audi", model, year, color, engine, gearBox, isRented, price );
    }
}



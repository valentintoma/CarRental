package ro.jademy.carrental.cars.carsManufacture.bmw;

import ro.jademy.carrental.cars.Car;
import ro.jademy.carrental.cars.parts.Components.GearBox;
import ro.jademy.carrental.cars.parts.Components.engine.Engine;

import java.math.BigDecimal;
import java.util.HashMap;

public class BMW extends Car {


    public BMW( String model, Integer year, String color, Engine engine, GearBox gearBox, Boolean isRented, BigDecimal price) {
        super ( "BMW", model, year, color, engine, gearBox, isRented, price );

    }
}

package ro.jademy.carrental.cars.parts.Components.Cars.BMW;

import ro.jademy.carrental.cars.Car;
import ro.jademy.carrental.cars.parts.Components.GearBox;
import ro.jademy.carrental.cars.parts.Components.Engine.Engine;

import java.math.BigDecimal;

public class BMW extends Car {

    public String wheels;
    private Boolean sunRoof;

    public BMW(String model, Integer year, String color, Engine engine, GearBox gearBox, Boolean rented, BigDecimal price, String wheels, Boolean sunRoof) {
        super ( "BMW", model, year, color, engine,gearBox, rented, price );
        this.wheels = wheels;
        this.sunRoof = sunRoof;
    }
}

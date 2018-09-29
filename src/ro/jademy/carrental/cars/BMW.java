package ro.jademy.carrental.cars;

import ro.jademy.carrental.cars.parts.Engine;

public class BMW extends Car {

    public String wheels;
    private Boolean sunRoof;

    public BMW( String model, Integer year, String color, Engine engine, Boolean rented, Integer price, String wheels, Boolean sunRoof) {
        super ( "BMW", model, year, color, engine, rented, price );
        this.wheels = wheels;
        this.sunRoof = sunRoof;
    }
}

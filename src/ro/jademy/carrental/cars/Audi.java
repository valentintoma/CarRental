package ro.jademy.carrental.cars;

import ro.jademy.carrental.cars.parts.Engine;

public  class Audi extends Car {
    private  Boolean sunRoof;

    public Audi( String model, Integer year, String color, Engine engine, Boolean rented, Integer price, Boolean sunRoof) {
        super ( "Audi", model, year, color, engine, rented, price );
        this.sunRoof = sunRoof;
    }
}



package ro.jademy.carrental.cars;

import ro.jademy.carrental.cars.parts.Components.GearBox;
import ro.jademy.carrental.cars.parts.Components.engine.Engine;

import java.math.BigDecimal;

public abstract class Car {
    // Q: how can we better represent the car make?
    private String make;
    private String model;
    private Integer year;
    private String color;
    private Engine engine;
    private Boolean rented;
    private BigDecimal price;
    private GearBox gearBox;

    public Car(String make, String model, Integer year, String color, Engine engine,GearBox gearBox, Boolean rented, BigDecimal price ) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.engine = engine;
        this.gearBox = gearBox;
        this.rented = rented;
        this.price = price;

    }

    public Car(){

    }

    public GearBox getGearBox() {
        return gearBox;
    }

    public void setGearBox(GearBox gearBox) {
        this.gearBox = gearBox;
    }

    public Boolean getRented() {
        return this.rented;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public void setRented(Boolean rented) {
        this.rented = rented;
    }

    public Integer getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public Engine getEngine() {
        return engine;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return
                "Car: "+ " "+ make +" ,  "+"Model:"+" "+ model+"  , "+  "Year:"+" "+ year +"  , "+ "Color:" +"  " +color +"  , " +  "Engine Specs " +  engine +" "+ "Gearbox type : "+ gearBox + ",  "+
                "Rented:"+" "+ rented +"  , "+  "Price:"  +" "+ price ;




        //
//    // Q: how can we better represent the car type?
//    public String carType; // coupe, sedan, hatchback, convertible, wagon, SUV
//
//    // Q: how can we better represent the motor type?
//    public String fuelType; // diesel, gasoline, alternative
//
//    public Integer doorNumber;
//
//    public String color;
//
//    // Q: how can we better represent the transmission type?
//    public String transmissionType; // automatic, manual
//
//    // Q: how can we better represent the engine?
//    public String engine;
//
//    // Q: how can we better represent money value?
//    public String basePrice;
//
//    // Q: do we need a constructor other than the default one?
//    // Q: how can we better protect the car data?

    }
}

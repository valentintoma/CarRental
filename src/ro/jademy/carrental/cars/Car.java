package ro.jademy.carrental.cars;

import ro.jademy.carrental.cars.parts.Engine;

public abstract class Car {
    // Q: how can we better represent the car make?
    private String make;
    private String model;
    private Integer year;
    private String color;
    private Engine engine;
    private Boolean rented;
    private Integer price;

    public Boolean getRented() {
        return rented;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
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
    public Integer getPrice() {
        return price;
    }

    public Car(String make, String model, Integer year, String color, Engine engine, Boolean rented, Integer price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.engine = engine;
        this.rented = rented;
        this.price = price;
    }


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

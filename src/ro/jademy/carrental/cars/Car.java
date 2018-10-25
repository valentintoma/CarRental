package ro.jademy.carrental.cars;

import ro.jademy.carrental.cars.parts.Components.GearBox;
import ro.jademy.carrental.cars.parts.Components.engine.Engine;

import java.math.BigDecimal;

public abstract class Car implements Comparable<Car> {
    // Q: how can we better represent the car make?
    private String make;
    private String model;
    private Integer year;
    private String color;
    private Engine engine;
    private State carState = new State ();
    private BigDecimal price;
    private GearBox gearBox;

    public Car(String make, String model, Integer year, String color, Engine engine, GearBox gearBox, Boolean isRented, BigDecimal price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.engine = engine;
        this.gearBox = gearBox;
        this.carState.setRented ( isRented );
        this.price = price;

    }


    public Car() {

    }

    @Override
    public int compareTo(Car o) {
        int makeType = this.make.compareTo ( o.make );
        if (makeType == 0) {
            int colorType = this.color.compareTo ( o.color );
            if (colorType == 0) {
                int yearType = this.year.compareTo ( o.year );
                if (yearType == 0) {
                    return 0;
                }
                return yearType;

            }
            return colorType;
        }
        return makeType;
    }

    public GearBox getGearBox() {
        return gearBox;
    }

    public void setGearBox(GearBox gearBox) {
        this.gearBox = gearBox;
    }

    public State getCarState() {
        return carState;
    }


    public void setCarState(State carState) {
        this.carState = carState;
    }

    public void setRented(Boolean isRented) {
        this.carState.setRented ( isRented );
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

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return
                "Make: " + " " + make + " ,  " + "Model:" + " " + model + " ,  " + "Year:" + " " + year + " ,  " + "Color:" + "  " + color + " ,  " + "Engine Specs " + engine + " " + "Gearbox type : " + gearBox + " ,  " +
                        "Rented:" + " " + carState + " ,  " + "Price:" + " " + price;

    }
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


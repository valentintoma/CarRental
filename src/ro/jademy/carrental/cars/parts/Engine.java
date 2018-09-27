package ro.jademy.carrental.cars.parts;

public class Engine {

    public String fuel;
    public Integer horsePower;

    public Engine(String fuel, Integer horsePower) {
        this.fuel = fuel;
        this.horsePower = horsePower;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;

    }

    public Integer getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(Integer horsePower) {
        this.horsePower = horsePower;
    }
}

package ro.jademy.carrental.cars.parts;

public class Engine {

    private String fuel;
    private Integer horsePower;
    private Double cilinder;

    public Engine(String fuel, Integer horsePower,Double cilinder) {
        this.fuel = fuel;
        this.horsePower = horsePower;
        this.cilinder = cilinder;


    }

    @Override
    public String toString() {
        return
                "Fuel:" +" "+ fuel +" "+  "HorsePower:" +" "+  horsePower  +"  " +"Cilinder:"+" "+ cilinder +" " ;
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

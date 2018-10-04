package ro.jademy.carrental.cars.parts.Components.engine;

public class Engine {

    private FuellType fuel;
    private Integer horsePower;
    private Double cilinder;

    public Engine(FuellType fuel, Integer horsePower,Double cilinder) {
        this.fuel = fuel;
        this.horsePower = horsePower;
        this.cilinder = cilinder;


    }

    @Override
    public String toString() {
        return
                "Fuel:" + fuel.getName () +", "+  "HorsePower:" +""+  horsePower  +"  ,  " +"Cilinder:"+""+ cilinder +", " ;
    }

    public FuellType getFuel() {
        return fuel;
    }



    public Integer getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(Integer horsePower) {
        this.horsePower = horsePower;
    }
}

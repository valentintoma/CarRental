package ro.jademy.carrental.cars.carsManufacture.comparator;

import ro.jademy.carrental.cars.Car;

import java.util.Comparator;

public class PriceComparator implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        return o1.getPrice ().compareTo ( o2.getPrice () );
    }
}

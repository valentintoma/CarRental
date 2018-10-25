package ro.jademy.carrental.cars;

import java.util.Calendar;

public class State {

    private boolean isRented = false;
    private Calendar rentedFrom;
    private Calendar rentedUntil;

    public boolean isRented() {
        return isRented;
    }

    public void setRented(boolean rented) {
        isRented = rented;
    }

    public Calendar getRentedFrom() {
        return rentedFrom;
    }

    public void setRentedFrom(Calendar rentedFrom) {
        this.rentedFrom = rentedFrom;
    }

    public Calendar getRentedUntil() {
        return rentedUntil;
    }

    public void setRentedUntil(Calendar rentedUntil) {
        this.rentedUntil = rentedUntil;
    }

    @Override
    public String toString() {
        return "" + isRented ;
    }
}


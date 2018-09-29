package ro.jademy.carrental;

import ro.jademy.carrental.cars.Audi;
import ro.jademy.carrental.cars.BMW;
import ro.jademy.carrental.cars.Car;
import ro.jademy.carrental.cars.parts.Engine;
import ro.jademy.carrental.persons.Salesman;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
    // Q: what fields and methods should this class contain?

    private ArrayList<Salesman> salesmen = new ArrayList<> ();
    private ArrayList<Car> cars = new ArrayList<> ();
    private Scanner sc = new Scanner ( System.in );


    public Shop() {
        //adaug salemens


        salesmen.add ( new Salesman ( "Mircea", "Chesca", "mircea1", "papusa" ) );
        salesmen.add ( new Salesman ( "Vlad", "Dumitru", "vlad1", "papusa1" ) );
        salesmen.add ( new Salesman ( "Alin", "Ionescu", "alin1", "papusa2" ) );

        cars.add ( new Audi ( "A4", 2010, "blue", new Engine ( "Disel", 245, 2.0 ), true, 25, false ) );
        cars.add ( new Audi ( "A6", 2011, "black", new Engine ( "Gas", 350, 3.0 ), false, 25, true ) );
        cars.add ( new BMW ( "530", 2015, "green", new Engine ( "Diesel", 330, 3.0 ), false, 25, "Alloy", true ) );

    }


    public void loginMenu() {
        boolean logged;
        do {

            System.out.println ( "Write username : " );
            String username = sc.nextLine ();
            System.out.println ( "Write your password : " );
            String passwrod = sc.nextLine ();
            logged = logUser ( username, passwrod );
        }
        while (!logged);
    }

    private boolean logUser(String username, String password) {
        for (Salesman salesman : salesmen) {
            if (username.equals ( salesman.getUserName () )) {
                if (password.equals ( salesman.getPassWord () )) {
                    System.out.println ( username + " Welcome back Boss!! " );
                    return true;

                }
            }
        }
        System.out.println ( "User name or password are wrong! try again" );

        return false;
    }


    //ciclez prin lista si verific daca si userul parola exista in lista

    // TODO: implement a basic user login


    public void showMenu() {

        System.out.println ( " -----------------------------------------------" );
        System.out.println ( "|    Welcome to the Jademy Car Rental Service   |" );
        System.out.println ( " -----------------------------------------------" );
        System.out.println ();
        System.out.println ( "                    MAIN MENU                   " );
        System.out.println ( "1. List all cars" );
        System.out.println ( "2. List available cars" );
        System.out.println ( "3. List rented cars" );
        System.out.println ( "4. Check income" );
        System.out.println ( "5. Logout" );
        System.out.println ( "6. Exit" );

        int choiceOption = sc.nextInt ();
        switch (choiceOption) {
            case 1: {
                showAllCars ();
                break;
            }
            case 2: {
                showAvaibleCars ();
                rentAcar ();
                break;

            }
            case 3: {
                showRentedCars ();
                break;
            }
            case 4: {
                checkIncome ();
            }
            case 5: {
                logOut ();
            }
            case 6: {
                exit ();
            }

        }
    }

    public void rentAcar() {

        System.out.println ( "1.Wich care you do you want to rent?" );
        int choice = sc.nextInt ();

        int i = 0;

        if (choice == i) {
            choseRentedCar (choice);
            System.out.println ("Ai ales mainsa corecta :");

    }

}


    public void showAllCars() {
        for (Car car : cars) {
            System.out.println ( car.toString () );
        }
    }

    public void showAvaibleCars() {
        for (Car car
                : cars) {
            if (!car.getRented ()) {
                System.out.println ( car.toString () );


            }

        }
    }

    public void showRentedCars() {
        for (Car car : cars
                ) {
            if (car.getRented ()) {
                System.out.println ( car.toString () );
            }

        }

    }

    public int choseRentedCar(int choiceSelected) {
        for (Car car : cars) {
            // trebuie sa aleg masina din lista cu masini libere
            if (!car.getRented ()) {
                System.out.println ( "Alege din lista corecta " );
                System.out.println ( returnFreecars ().toString () );
            }

        }
        return choiceSelected;

    }


    public ArrayList<Car> returnFreecars() {

        ArrayList<Car> freeCars = new ArrayList<> ();
        for (Car car
                : cars) {
            if (!car.getRented ()) {
                freeCars.add ( car );


            }

        }
        return freeCars;

    }

    public void checkIncome() {

    }

    public void logOut() {

    }

    public void exit() {

    }

    public void showListMenuOptions() {

        System.out.println ( "Select an action from below:" );
        System.out.println ( "1. Filter by make" );
        System.out.println ( "2. Filter by model" );
        System.out.println ( "3. Filter by budget" );
        // TODO: add additional filter methods based on car specs

        System.out.println ( "4. Back to previous menu" );

    }

    public void calculatePrice(int numberOfDays) {
        // TODO: apply a discount to the base price of a car based on the number of rental days
        // TODO: document the implemented discount algorithm

        // TODO: for a more difficult algorithm, change this method to include date intervals and take into account
        //       weekdays and national holidays in which the discount should be smaller

        // Q: what should be the return type of this method?
    }
}

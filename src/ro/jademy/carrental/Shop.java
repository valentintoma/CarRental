package ro.jademy.carrental;

import ro.jademy.carrental.cars.parts.Components.Cars.Audi.Audi;
import ro.jademy.carrental.cars.parts.Components.Cars.BMW.BMW;
import ro.jademy.carrental.cars.Car;
import ro.jademy.carrental.cars.parts.Components.Engine.FuellType;
import ro.jademy.carrental.cars.parts.Components.GearBox;
import ro.jademy.carrental.cars.parts.Components.geaBoxMaker.GeaBoxModel;
import ro.jademy.carrental.cars.parts.Components.Engine.Engine;
import ro.jademy.carrental.persons.Salesman;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
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

        cars.add ( new Audi ( "A4", 2010, "blue", new Engine ( FuellType.DIESEL, 245, 2.0 ), new GearBox ( GeaBoxModel.AUTOMATIC ),false, new BigDecimal ( 25 ),true ) );
        cars.add ( new Audi ( "A6", 2011, "black", new Engine ( FuellType.DIESEL, 350, 3.0 ),new GearBox ( GeaBoxModel.MANUAL ), false, new BigDecimal ( 10 ), true ) );
        cars.add ( new BMW ( "530", 2015, "green", new Engine ( FuellType.GAS, 330, 3.0 ),new GearBox (GeaBoxModel.SWITCHABLE) ,true, new BigDecimal ( 25 ), "Alloy", true ) );

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
        System.out.println ( "5. Filter by " );
        System.out.println ( "6. Logout" );
        System.out.println ( "7 . Exit" );

        int choiceChosed = sc.nextInt ();
        switch (choiceChosed) {
            case 1: {
                showAllCars ();
                break;
            }
            case 2: {
                showAvaibleCars ();
                wantToRentACar ();

                System.out.println ( "Avaible cars remains are :" );
                showAvaibleCars ();


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
                showFilterMenu ();
            }
            case 6: {
                logOut ();
            }
            case 7: {
                exit ();
            }

        }
    }

    public void rentAcar() {

        System.out.println ( "Type car number that you want to rent :" );
        int carRented = sc.nextInt ();
        cars.get ( carRented ).setRented ( true );

    }

    public void wantToRentACar() {
        System.out.println ( "Rent a Car? Yes / No " );
        String answer = sc.next ();
        if (answer.equalsIgnoreCase ( "Yes" )) {
            rentAcar ();
        } else if (answer.equalsIgnoreCase ( "no" ))
            showMenu ();
    }

    public void filterByMake() {
        System.out.println ( "Type the make you want to rent :" );
        String makeAnswer = sc.next ();
        List<Car> filtredMake = new ArrayList<> ();
        for (Car car : cars) {
            if (car.getMake ().equalsIgnoreCase ( makeAnswer )) {
                filtredMake.add ( car );
            }

        }
        System.out.println ( "Cars filtred by  : " + makeAnswer );
        System.out.println ( filtredMake.toString () );

        if (makeAnswer.isEmpty ()){
            System.out.println ("We dont have that car");

        }

    }

    public void filterByFuel() {
        System.out.println ( "Type the fuel you want to rent ? Disel / Gas / Electric" );
        String fuellAnswer = sc.next ();
        List<Car> fuellList = new ArrayList<> ();
        for (Car car : cars) {
            if (car.getEngine ().getFuel ().getName ().equalsIgnoreCase ( fuellAnswer )) {
                fuellList.add ( car );
            }

        }
        System.out.println ( "Cars filtred by  : " + fuellAnswer );
        System.out.println ( fuellList.toString () );

    }
    public void filterByBudget() {
        System.out.println ( "Type the budget  you want to renta car ? From 10$ to 25$ " );
        String priceAnswer = sc.next ();
        List<Car> priceList = new ArrayList<> ();
        for (Car car : cars) {
            if (car.getPrice ().toString().equalsIgnoreCase  ( priceAnswer )) {   // de intrebat la curs
                priceList.add ( car );
            }

        }
        System.out.println ( "Price for those cars is  : " + priceAnswer + "$" );
        System.out.println ( priceList.toString () );

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

    public void showFilterMenu() {
        System.out.println ( "1.Filter by make" );
        System.out.println ( "2.Filter by model" );
        System.out.println ( "3.Filter by budget" );
        System.out.println ( "4.Back to Menu" );

        int option = sc.nextInt ();
        switch (option) {
            case 1: {
                filterByMake ();
                break;
            }
            case 2: {
                filterByFuel ();
                break;
            }
            case 3: {
                filterByBudget();

            }
            break;
            case 4: {
                showMenu ();

            }
            break;

        }
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

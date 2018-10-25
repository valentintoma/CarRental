package ro.jademy.carrental;

import ro.jademy.carrental.cars.Car;
import ro.jademy.carrental.cars.carsManufacture.audi.Audi;
import ro.jademy.carrental.cars.carsManufacture.bmw.BMW;
import ro.jademy.carrental.cars.parts.Components.GearBox;
import ro.jademy.carrental.cars.parts.Components.engine.Engine;
import ro.jademy.carrental.cars.parts.Components.engine.FuellType;
import ro.jademy.carrental.cars.parts.Components.geaBoxMaker.GeaBoxModel;
import ro.jademy.carrental.persons.Salesman;

import java.math.BigDecimal;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Shop {
    // Q: what fields and methods should this class contain?

    private Set<Salesman> salesmen = new HashSet<> ();
    private ArrayList<Car> cars = new ArrayList<> ();
    private Scanner sc = new Scanner ( System.in );


    public Shop() {
        //adaug salemens


        salesmen.add ( new Salesman ( "Mircea", "Chesca", "mircea1", "12345" ) );
        salesmen.add ( new Salesman ( "Vlad", "Dumitru", "vlad1", "12345" ) );
        salesmen.add ( new Salesman ( "Alin", "Ionescu", "alin1", "12345" ) );

        cars.add ( new Audi ( "A4", 2010, "blue", new Engine ( FuellType.DIESEL, 245, 2.0 ), new GearBox ( GeaBoxModel.AUTOMATIC ), false, new BigDecimal ( 25 ) ) );

        cars.add ( new Audi ( "A8", 2011, "blue", new Engine ( FuellType.GAS, 330, 3.0 ), new GearBox ( GeaBoxModel.SWITCHABLE ), true, new BigDecimal ( 35 ) ) );
        cars.add ( new Audi ( "A6", 2011, "black", new Engine ( FuellType.DIESEL, 350, 3.0 ), new GearBox ( GeaBoxModel.MANUAL ), false, new BigDecimal ( 10 ) ) );
        cars.add ( new BMW ( "530", 2015, "green", new Engine ( FuellType.GAS, 330, 3.0 ), new GearBox ( GeaBoxModel.SWITCHABLE ), true, new BigDecimal ( 30 ) ) );

    }

    public static List<Car> filterStream(List<Car> cars, Predicate<Car> predicate) {

        cars.stream ().filter ( predicate ).collect ( Collectors.toList () );
        return cars;
    }

    public void loginMenu() {
        boolean logged;
        do {

            System.out.println ( "Write username : " );
            String username = sc.nextLine ();
            System.out.println ( "Write your password : " );
            String password = sc.nextLine ();
            logged = logUser ( username, password );
        }
        while (!logged);
    }


    //ciclez prin lista si verific daca si userul parola exista in lista

    // TODO: implement a basic user login

    private boolean logUser(String username, String password) {
        for (Salesman salesman : salesmen) {
            if (username.equals ( salesman.getUserName () )) {
                if (password.equals ( salesman.getPassWord () )) {
                    System.out.println ( "" );
                    System.out.println ( salesman.getFirstName () + " " + salesman.getlastName () + "," + " Welcome back Boss!! " );
                    System.out.println ( "" );
                    return true;

                }
            }
        }
        System.out.println ( "Username or password are wrong! try again" );

        return false;
    }

    public void showMenu() {

        System.out.println ( " -----------------------------------------------" );
        System.out.println ( "|    Welcome to the Jademy Car Rental Service   |" );
        System.out.println ( " -----------------------------------------------" );
        System.out.println ();
        System.out.println ( "                    MAIN MENU                   " );
        System.out.println ( "1. List all cars" );
        System.out.println ( "2. List available cars" );
        System.out.println ( "3. List rented cars" );
        System.out.println ( "4. Filter by " );
        System.out.println ( "5. Logout" );
        System.out.println ( "6 . Exit" );

        int choiceChosed = sc.nextInt ();

        switch (choiceChosed) {
            case 1: {
                showAllCars ();
                backTofirstMenu ();
                break;
            }
            case 2: {
                showAvaibleCars ();
                wantToRentACar ();

                System.out.println ( "Avaible cars remains are :" );
                showAvaibleCars ();
                backTofirstMenu ();
                break;

            }
            case 3: {
                showRentedCars ();
                backTofirstMenu ();
                break;
            }
            case 4: {
                showFilterMenu ();
            }
            case 5: {
                logOut ();
            }
            case 6: {
                exit ();
            }

        }
    }

    public void backTofirstMenu() {
        System.out.println ( "" );
        System.out.println ( "2.Back to first Menu" );
        int choice = sc.nextInt ();
        if (choice == 2) {
            showMenu ();
        }
    }

    public void rentAcar() {

        System.out.println ( "Type car number that you want to rent :" );
        ArrayList rentedCars = new ArrayList ();
        int carRented = sc.nextInt ();


        cars.get ( carRented - 1 ).setRented ( true );

        //add rented car in a list
    }

    public void wantToRentACar() {
        System.out.println ( "" );
        System.out.println ( "Rent a Car? Yes / No " );
        String answer = sc.next ();
        if (answer.equalsIgnoreCase ( "Yes" )) {
            rentAcar ();
        } else if (answer.equalsIgnoreCase ( "no" )) {
            showMenu ();
        }
    }

    public void filterByMake() {
        System.out.println ( "Type the make you want to rent :" );
        String makeAnswer = sc.next ();
        ArrayList<Car> filtredMake = new ArrayList<> ();

        System.out.println ( filterStream ( cars, (Car car) -> car.getMake ().equalsIgnoreCase ( makeAnswer ) ) );


        //     filtredMake.stream ().forEach ( car -> car.getMake ().equalsIgnoreCase ( makeAnswer ) );
//        for (Car car : cars) {
//            if (car.getMake ().equalsIgnoreCase ( makeAnswer )) {
//                filtredMake.add ( car );
//            }
//
//        }
        //       System.out.println ( "Cars filtred by  : " + makeAnswer );

//        showCars ( filtredMake );

//        if (makeAnswer.isEmpty ()) {
//            System.out.println ( "We dont have that car" );
//
//        }
//
//    }
    }

    public void filterByFuel() {
        System.out.println ( "Type the fuel you want to rent ? Disel / Gas / Electric" );
        String fuellAnswer = sc.next ();
        ArrayList<Car> fuellList = new ArrayList<> ();

        System.out.println ( filterStream ( cars, car -> car.getEngine ().getFuel ().getName ().equalsIgnoreCase ( fuellAnswer ) ) );


//        for (Car car : cars) {
//            if (car.getEngine ().getFuel ().getName ().equalsIgnoreCase ( fuellAnswer )) {
//                fuellList.add ( car );
//            }
//
//        }
//        System.out.println ( "Cars filtred by fuel type  : " + fuellAnswer );
//        showCars ( fuellList );
//
//        if (fuellList.isEmpty ()) {
//            System.out.println ( "We dont have a car with that type of fuel  right now " );
//        }
    }

    public void showFilterByPrice() {

        System.out.println ( "1.Show cars by lower price first" );
        System.out.println ( "2.Show cars by higher price first" );
        System.out.println ( "3.Show cars by a specified price" );
        System.out.println ( "4.Show cars lower then :" );
        System.out.println ( "5.Show cars higher then :" );
        System.out.println ( "6.Back to previous menu" );

        int choiceSelected = sc.nextInt ();
        switch (choiceSelected) {
            case 1: {
                showCarsLowerPriceFirst ();
                showFilterMenu ();
                break;
            }
            case 2: {
                showCarsHigherPriceFirst ();
                break;

            }
            case 3: {
                showCarsByPrice ();
                break;

            }
            case 4: {
                showCarsLowerThen ();
                break;

            }
            case 5: {
                showCarsHigherThen ();
                break;

            }
            case 6: {
                showFilterMenu ();
            }
        }

    }

    public void showCarsLowerThen() {
        System.out.println ( "Type the maximum price :" );
        int price = sc.nextInt ();
        List<Car> filtredCars = cars.stream ().filter ( car -> BigDecimal.valueOf ( price ).compareTo ( car.getPrice () ) > 0 ).collect ( Collectors.toList () );
        showCars ( filtredCars );  //un for pentru a le printa frumos :)

    }

    public void showCarsHigherThen() {
        System.out.println ( "Type the minimum price :" );
        int price = sc.nextInt ();
        List<Car> filtredCars = cars.stream ().filter ( car -> BigDecimal.valueOf ( price ).compareTo ( car.getPrice () ) < 0 ).collect ( Collectors.toList () );
        showCars ( filtredCars );  //un for pentru a le printa frumos :)
    }


    public void showCars(List<Car> cars) {
        for (Car car : cars) {
            System.out.println ( (cars.indexOf ( car ) + 1) + " " + car.toString () );
        }
    }

    public void showCarsLowerPriceFirst() {

        List<Car> sortedCars = cars.stream ().sorted ( Comparator.comparing ( Car::getPrice ) ).collect ( Collectors.toList () );
        showCars ( sortedCars );
    }

    public void showCarsHigherPriceFirst() {
        List<Car> sortedCarsDescending = cars.stream ().sorted ( Comparator.comparing ( Car::getPrice ).reversed () ).collect ( Collectors.toList () );
        showCars ( sortedCarsDescending );
    }

    public void showCarsByPrice() {
        System.out.println ( "Type the budget  you want to renta car ? From 10$ to 25$ " );
        String price = sc.next ();
        List<Car> priceList = new ArrayList<> ();

        filterStream ( cars, car -> car.getPrice ().toString ().equalsIgnoreCase ( price ) );

        for (Car car : cars) {
            if (car.getPrice ().toString ().equalsIgnoreCase ( price )) {   // de intrebat la curs
                priceList.add ( car );
            }


        }
        if (priceList.isEmpty ()) {
            System.out.println ( "We dont have a car with price " + price );
        }

        System.out.println ( priceList.toString () );

    }


    public void showAllCars() {
        for (Car car : cars) {
            System.out.println ( (cars.indexOf ( car ) + 1) + " " + car.toString () );
        }
    }

    public void showAvaibleCars() {

        for (Car car : cars) {
            if (!car.getCarState ().isRented ()) {
                System.out.println ( (cars.indexOf ( car ) + 1) + " " + car.toString () );

            }

        }
    }

    public void showRentedCars() {

        System.out.println ( "" );
        for (Car car : cars
                ) {
            if (car.getCarState ().isRented ()) {
                System.out.println ( car.toString () );
            }

        }

    }

    public void showFilterMenu() {
        System.out.println ( "1.Filter by make" );
        System.out.println ( "2.Filter by fuel" );
        System.out.println ( "3.Filter by budget" );
        System.out.println ( "4.Back to Menu" );

        int option = sc.nextInt ();
        switch (option) {
            case 1: {
                filterByMake ();
                showFilterMenu ();
                break;
            }
            case 2: {
                filterByFuel ();
                showFilterMenu ();
                break;
            }
            case 3: {
                showFilterByPrice ();
                showFilterMenu ();
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
        System.out.println ( "User logged out " );
        System.out.println ( "See you soon back !" );

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

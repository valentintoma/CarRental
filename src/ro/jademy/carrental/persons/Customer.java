package ro.jademy.carrental.persons;

public class Customer  extends Person {


    private int budget;
    public Customer(String firstName, String lastName, int budget){
        super(firstName,lastName);
        this.budget = budget;
    }


}

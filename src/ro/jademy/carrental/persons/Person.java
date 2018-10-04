package ro.jademy.carrental.persons;

public abstract class Person {
    protected String firstName;
    protected String lastName;

    protected Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

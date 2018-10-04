package ro.jademy.carrental.persons;

public class Salesman extends Person {

    // Q: how can we avoid duplicate code in the salesman and the customer classes?


    private String userName;
    private String passWord;

    public Salesman(String firstName, String lastName, String userName, String passWord) {
        super ( firstName, lastName );
        this.userName = userName;
        this.passWord = passWord;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getlastName() {
        this.lastName = lastName;
        return lastName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }


}


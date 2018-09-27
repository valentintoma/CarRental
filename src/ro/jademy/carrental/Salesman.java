package ro.jademy.carrental;

public class Salesman extends  Person {

    // Q: how can we avoid duplicate code in the salesman and the customer classes?

    private String firstName;
    private String lastName;
    private String userName;
    private String passWord;




    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}


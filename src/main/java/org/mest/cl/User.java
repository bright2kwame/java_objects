package org.mest.cl;

public class User {
    String firstName = "";
    String lastName = "";
    String middleName = "";

    private Status status;

    public User(String firstName){
        this.firstName = firstName;
        this.status = new Status();
    }

    User(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    User(String firstName, String middleName, String lastName){
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Status getStatus() {
        return status;
    }
}

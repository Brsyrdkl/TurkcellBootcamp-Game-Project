package org.example;

public class Edevlet extends User{

    private String id;

    public Edevlet() {
    }

    public Edevlet(String id, String tcNumber, String firstName, String lastName, String yearOfBirth) {
        super(tcNumber, firstName, lastName, yearOfBirth);
        this.id = id;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}


package com.springindepth.vote;

public class Candidate {

    private String firstName;
    private String lastName;

    public Candidate() {
        firstName = "noname";
        lastName = "noname";
    }


    public Candidate(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

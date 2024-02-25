package com.vinsquru.tests.fightreservation.model;

public class FlightReservationTestData {
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private String street;
    private String city;

    public FlightReservationTestData(String firstname, String lastname, String email, String password, String street, String city, String zip, String passengersCount, String expectedPrice) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
        this.street = street;
        this.city = city;
        this.zip = zip;
        this.passengersCount = passengersCount;
        this.expectedPrice = expectedPrice;
    }

    private String zip;
    private String passengersCount;
    private String expectedPrice;

    public FlightReservationTestData() {
    }


    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getZip() {
        return zip;
    }

    public String getPassengersCount() {
        return passengersCount;
    }

    public String getExpectedPrice() {
        return expectedPrice;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public void setPassengersCount(String passengersCount) {
        this.passengersCount = passengersCount;
    }

    public void setExpectedPrice(String expectedPrice) {
        this.expectedPrice = expectedPrice;
    }
}

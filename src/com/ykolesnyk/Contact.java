package com.ykolesnyk;

import java.util.Date;

public class Contact {

    // Save Contacts
    // Name
    private String firstName;

    // Last name
    private String lastName;

    // Phone number
     private long phoneNumber;

    //Address
    private Address address;

    // Date of birth
    private Date dateOfBirth;

    public Contact(String firstName, String lastName, long phoneNumber, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.address = address;
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

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(com.ykolesnyk.Address address) {
        this.address = address;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDate(Date date) {
        this.dateOfBirth = date;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", address=" + address +
                '}';
    }
}
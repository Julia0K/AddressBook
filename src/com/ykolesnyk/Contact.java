package com.ykolesnyk;

import java.util.Date;

public class Contact {

    // Save Contacts
    // Name
    private String name;

    // Last name
    private String lastName;

    // Phone number
     private long phoneNumber;

    //Address
    private Address address;

    // Date of birth
    private Date date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public com.ykolesnyk.Address getAddress() {
        return address;
    }

    public void setAddress(com.ykolesnyk.Address address) {
        this.address = address;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
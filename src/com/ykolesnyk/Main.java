package com.ykolesnyk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws IOException {
        //TO DO:
        // Save Contacts
        // Name
        // Last name
        // Phone number
        // Address
        // Date of birth
        // Search by phone
        // Search query input
        // Display search results in console
        Address address = new Address();
        address.setHouseNumber(100);
        System.out.println(address.getHouseNumber());
        String firstName = textInput("first name");
        String lastName = textInput("last name");
        long phoneNumber = Long.parseLong(textInput("phone number"));
        Date dateOfBirth = textInput("date of birth");
        createContact(firstName, lastName, phoneNumber, dateOfBirth);
    }

    public static Contact createContact(String firstName, String lastName, long phoneNumber, Date dateOfBirth) { // <--- all this row is method signature
        Contact contact = new Contact(); // <--- Creates new object Contact
        contact.setFirstName(firstName);
        contact.setLastName(lastName);
        contact.setPhoneNumber(phoneNumber);
        contact.setDate(dateOfBirth);
        System.out.println(contact.getFirstName() +"\n"+ contact.getLastName() + "\n"+ contact.getPhoneNumber() + "\n" + contact.getDate());

        return contact;
    }

    public static String textInput(String message) throws IOException {
        InputStreamReader streamReader = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(streamReader);
        System.out.println("Please enter your " + message);
        String text = reader.readLine();
        System.out.println("You entered " + text + " as your " + message);

        return text;

    }
}

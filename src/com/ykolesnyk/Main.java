package com.ykolesnyk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
        //address.getHouseNumber();
        System.out.println(address.getHouseNumber());
        //textInput();
        createContact(textInput(),textInput());
    }
    public static Contact createContact(String firstName, String lastName) {
        Contact contact = new Contact();
        contact.setFirstName(firstName);
        contact.setLastName(lastName);
        System.out.println(contact.getFirstName() + contact.getLastName());

        return contact;
    }
    public static String textInput() throws IOException {
        InputStreamReader streamReader = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(streamReader);
        String text = reader.readLine();
        System.out.println(text);

        return text;

    }
}

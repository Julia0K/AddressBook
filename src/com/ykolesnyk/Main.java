package com.ykolesnyk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws IOException {
        /*TO DO:
        Fields: First Name, Last name, Phone number, Date of Birth, Address
        Functionality: Save Contacts, Delete contacts, Search by phone/lastName/firstname, search input, displaying results */

        String firstName = textInput("first name");
        String lastName = textInput("last name");
        long phoneNumber = Long.parseLong(textInput("phone number"));
        //Date dateOfBirth = textInput("date of birth");
        //createContact(firstName, lastName, phoneNumber, dateOfBirth);
    }

    public static Contact createContact(String firstName, String lastName, long phoneNumber, Date dateOfBirth) { // <--- all this row is method signature
        Contact contact = new Contact(); // <--- Creates new object Contact
        contact.setFirstName(firstName);
        contact.setLastName(lastName);
        contact.setPhoneNumber(phoneNumber);
        System.out.println(contact.getFirstName() +"\n"+ contact.getLastName() + "\n"+ contact.getPhoneNumber());

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

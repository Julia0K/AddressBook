package com.ykolesnyk;

import java.io.IOException;
import java.util.ArrayList;

public class ContactService {

    private ContactsManager manager;

    public ContactService() {
        this.manager = new ContactsManager();
        this.manager.addContact(new Contact("testName1", "testLastName1", 123456789,
                new Address(1000, "qwerty", "new york", "NY", 12345)));
        this.manager.addContact(new Contact("testName2", "testLastName2", 456789, null));
        this.manager.addContact(new Contact("testName3", "testLastName3", 67894234, null));
    }

    public void createContact() throws IOException {
        String firstName = InputHelper.textInput("Please enter first name");
        String lastName = InputHelper.textInput("Please enter last name");
        long phoneNumber = Long.parseLong(InputHelper.textInput("Please enter phone number(digits ONLY)"));

        int houseNumber = Integer.parseInt(InputHelper.textInput("Please enter house number"));
        String streetName = InputHelper.textInput("Please enter street name");
        String cityName = InputHelper.textInput("Please enter your city");
        String state = InputHelper.textInput("Please enter your state");
        int zipCode = Integer.parseInt(InputHelper.textInput("Please enter your zipcode"));
        Address address = new Address(houseNumber, streetName, cityName, state, zipCode);

        Contact contact = new Contact(firstName, lastName, phoneNumber, address);
        manager.addContact(contact);
        System.out.println("New contact created!");

    }

    public void deleteContact() throws IOException {
        String firstName = InputHelper.textInput("Delete: Enter first name");
        String lastName = InputHelper.textInput("Delete: Enter last name");

        boolean result = manager.deleteContact(firstName, lastName);

        if (result) {
            System.out.println("Delete: The contact has been deleted");
        } else {
            System.out.println("Delete: The contact was not found");
        }
    }

    public void searchByName() throws IOException {
        String firstName = InputHelper.textInput("Search: Enter first name");
        ArrayList<Contact> searchResult = manager.searchByFirstName(firstName);
        if (!searchResult.isEmpty()) {
            System.out.println("Found contacts:");
            for (Contact contact : searchResult) {
                System.out.println(contact);
            }
        } else {
            System.out.println("No contacts were found");
        }
    }

    public void searchByLastName() throws IOException {
        String lastName = InputHelper.textInput("Search: Enter last name");
        ArrayList<Contact> searchResult = manager.searchByLastName(lastName);
        if (!searchResult.isEmpty()) {
            System.out.println("Found contacts:");
            for (Contact contact : searchResult) {
                System.out.println(contact);
            }
        } else {
            System.out.println("No contacts were found");
        }
    }

    public void searchByPhoneNumber() throws IOException {
        String phoneNumber = InputHelper.textInput("Search: Enter phone number");
        ArrayList<Contact> searchResult = manager.searchByPhoneNumber(phoneNumber);
        if (!searchResult.isEmpty()) {
            System.out.println("Found contacts:");
            for (Contact contact : searchResult) {
                System.out.println(contact);
            }
        } else {
            System.out.println("No contacts were found");
        }
    }

    public void showAllContacts() {
        System.out.println("****** List ** of ** contacts ******");
        for (Contact contact : manager.getAllContacts()) {
            System.out.println(contact);
        }
    }

    public void deleteAll() {
        manager.removeAll();
    }

}

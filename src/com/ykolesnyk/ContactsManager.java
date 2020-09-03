package com.ykolesnyk;

import java.util.ArrayList;

public class ContactsManager {

    Contact[] contacts = new Contact[100];

    public ArrayList<Contact> getAllContacts() {
        ArrayList<Contact> allContacts = new ArrayList<>();
        for (Contact contact : contacts) {
            if (contact != null) {
                allContacts.add(contact);
            }
        }
        return allContacts;
    }

    // this method will add new contacts
    public boolean addContact(Contact contact) {

        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] == null) {
                contacts[i] = contact;
                return true;
            }
        }
        return false;
    }

    //deleting the contact by first & last name
    public boolean deleteContact(String firstName, String lastName) {
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] != null && contacts[i].getFirstName().equals(firstName) && contacts[i].getLastName().equals(lastName)) {
                contacts[i] = null;
                break;
            }
        }
        return false;
    }

    //search by first name
    public ArrayList<Contact> searchByFirstName(String firstName) {
        ArrayList<Contact> foundContacts = new ArrayList<>();
        for (Contact contact : contacts) {
            if (contact != null && contact.getFirstName().equals(firstName)) {
                foundContacts.add(contact);
            }
        }
        return foundContacts;
    }

    // search by last name
    public ArrayList<Contact> searchByLastName(String lastName) {
        ArrayList<Contact> foundContacts = new ArrayList<>();
        for (Contact contact : contacts) {
            if (contact != null && contact.getLastName().equals(lastName)) {
                foundContacts.add(contact);
            }
        }
        return foundContacts;
    }

    // search by phone
    public ArrayList<Contact> searchByPhoneNumber(String phoneNumber) {
        ArrayList<Contact> foundContacts = new ArrayList<>();
        for (Contact contact : contacts) {
            if (contact != null && contact.getPhoneNumber() == Long.parseLong(phoneNumber)) {
                foundContacts.add(contact);
            }
        }
        return foundContacts;
    }

}

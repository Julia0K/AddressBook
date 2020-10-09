package com.ykolesnyk;

import java.util.ArrayList;

import static com.ykolesnyk.Storage.contacts;

public class ContactsManager {

    // TODO: 9/3/20 Поменять storage на ArrayList c <>
    // TODO: 9/3/20 Вынести storage в отдельный класс


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

        return contacts.add(contact);
    }

    //deleting the contact by first & last name
    public boolean deleteContact(String firstName, String lastName) {
        boolean result = false;
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getFirstName().equals(firstName) && contacts.get(i).getLastName().equals(lastName)) {
                Contact lastElement = contacts.get(contacts.size() -1);
                contacts.set(i, lastElement);
                contacts.remove(contacts.size() -1);
                result = true;
                break;
            }
        }
        return result;
    }

    //search by first name
    public ArrayList<Contact> searchByFirstName(String firstName) {
        ArrayList<Contact> foundContacts = new ArrayList<>();
        for (Contact contact : contacts) {
            if (contact.getFirstName().equals(firstName)) {
                foundContacts.add(contact);
            }
        }
        return foundContacts;
    }

    // search by last name
    public ArrayList<Contact> searchByLastName(String lastName) {
        ArrayList<Contact> foundContacts = new ArrayList<>();
        for (Contact contact : contacts) {
            if (contact.getLastName().equals(lastName)) {
                foundContacts.add(contact);
            }
        }
        return foundContacts;
    }

    // search by phone
    public ArrayList<Contact> searchByPhoneNumber(String phoneNumber) {
        ArrayList<Contact> foundContacts = new ArrayList<>();
        for (Contact contact : contacts) {
            if (contact.getPhoneNumber() == Long.parseLong(phoneNumber)) {
                foundContacts.add(contact);
            }
        }
        return foundContacts;
    }

    public void removeAll() {
        contacts.clear();
    }

}

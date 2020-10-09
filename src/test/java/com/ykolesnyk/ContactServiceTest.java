package com.ykolesnyk;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ContactServiceTest {

    private static ContactsManager contactsManager;
    private static String firstName1;
    private static String lastName1;
    private static long phoneNumber1;
    private static Address address1;
    private static String firstName2;
    private static String lastName2;
    private static long phoneNumber2;
    private static Address address2;

    @BeforeAll
    static void setUp() {
        firstName1 = "TestFirstName1";
        lastName1 = "TestLastName1";
        phoneNumber1 = 123456789L;
        int houseNumber1 = 123;
        String streetName1 = "TestStreetName1";
        String cityName1 = "TestCityName1";
        String state1 = "TestState1";
        int zipCode1 = 98208;
        address1 = new Address(houseNumber1, streetName1, cityName1, state1, zipCode1);

        firstName2 = "TestFirstName2";
        lastName2 = "TestLastName2";
        phoneNumber2 = 234567891L;
        int houseNumber2 = 234;
        String streetName2 = "TestStreetName2";
        String cityName2 = "TestCityName2";
        String state2 = "TestState2";
        int zipCode2 = 95000;
        address2 = new Address(houseNumber2, streetName2, cityName2, state2, zipCode2);

        contactsManager = new ContactsManager();
    }

    @Test
    void createContact_IsCreatedWithValidData() {
        Contact contact = new Contact(firstName1, lastName1, phoneNumber1, address1);
        contactsManager.addContact(contact);

        assertFalse(Storage.contacts.isEmpty());
        assertEquals("TestFirstName1", contactsManager.searchByFirstName("TestFirstName1").get(0).getFirstName());
    }

    @Test
    void deleteContact_IsDeletingExistingContact() {
        Contact contact = new Contact(firstName1, lastName1, phoneNumber1, address1);
        contactsManager.addContact(contact);

        assertTrue(contactsManager.deleteContact("TestFirstName1", "TestLastName1"));
        assertTrue(Storage.contacts.isEmpty());
    }

    @Test
    void deleteContact_IsNotDeletingExitingContact() {
        Contact contact = new Contact(firstName1, lastName1, phoneNumber1, address1);
        contactsManager.addContact(contact);

        assertEquals(1, contactsManager.getAllContacts().size());
        assertFalse(contactsManager.deleteContact("TestFirstName2", "TestLastName2"));
        assertEquals(1, contactsManager.getAllContacts().size());
    }

    @Test
    void getAllContacts() {
        Contact contact1 = new Contact(firstName1, lastName1, phoneNumber1, address1);
        Contact contact2 = new Contact(firstName2, lastName2, phoneNumber2, address2);

        contactsManager.addContact(contact1);
        contactsManager.addContact(contact2);

        ArrayList<Contact> list = contactsManager.getAllContacts();
        System.out.println(list.toString());

        assertNotNull(list);
        assertEquals("TestFirstName1", contactsManager.searchByFirstName("TestFirstName1").get(0).getFirstName());
        System.out.println(list.toString());
        //assertEquals("TestFirstName2", contactsManager.searchByFirstName("TestFirstName2").get(1).getFirstName());
        assertEquals(2, contactsManager.getAllContacts().size());
    }

    @AfterEach
    void tearDown() {
        contactsManager.removeAll();
    }
}
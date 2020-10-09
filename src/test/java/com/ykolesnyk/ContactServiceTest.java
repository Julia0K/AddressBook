package com.ykolesnyk;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class ContactServiceTest {

    @Test
    void createContactIsCreatedWithValidData() throws IOException {
        ContactsManager contactsManager = new ContactsManager();
        Contact contact = new Contact("Name1", "LastName", 234554,
                new Address(10555, "Main", "Bellevue", "WA", 98004));
        contactsManager.addContact(contact);
        assertEquals("Name1", contactsManager.searchByFirstName("Name1").get(0).getFirstName());
    }

    @Test
    void deleteContactIsDeletingExistingContact() {
        ContactsManager contactsManager = new ContactsManager();
        Contact contact = new Contact("Name2", "LastName2", 234554,
                new Address(10555, "Main", "Bellevue", "WA", 98004));
        contactsManager.addContact(contact);
        assertEquals("Name2", contactsManager.searchByFirstName("Name2").get(0).getFirstName());
        assertTrue(contactsManager.deleteContact("Name2", "LastName2"));
        assertEquals(0, contactsManager.searchByFirstName("Name2").size());
    }

    @Test
    void deleteContactIsNotDeletingExitingContact() {
        ContactsManager contactsManager = new ContactsManager();
        Contact contact = new Contact("Name3", "LastName3", 234554,
                new Address(10555, "Main", "Bellevue", "WA", 98004));
        contactsManager.addContact(contact);
        assertEquals(1 , contactsManager.getAllContacts().size());
        assertFalse(contactsManager.deleteContact("Name2", "LastName2"));
        assertEquals(1, contactsManager.getAllContacts().size());
    }
}
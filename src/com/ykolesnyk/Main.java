package com.ykolesnyk;

import java.io.IOException;

public class Main {

    private static final ContactService contactService = new ContactService();

    public static void main(String[] args) throws IOException {

        printHelp();
        boolean isRunning = true;

        // TODO: 9/3/20 Поменять условие в цикле с true на комманду выхода

        while (isRunning) {
            String command = InputHelper.textInput("Enter command:");

            switch (command) {
                case "add": {
                    contactService.createContact();
                }
                break;
                case "delete": {
                    contactService.deleteContact();
                }
                break;
                case "search by name": {
                    contactService.searchByName();
                }
                break;
                case "search by last name": {
                    contactService.searchByLastName();
                }
                break;
                case "search by phone": {
                    contactService.searchByPhoneNumber();
                }
                break;
                case "show all": {
                    contactService.showAllContacts();
                }
                break;
                case "exit": {
                    isRunning = false;
                }
                break;
                case "help": {
                    printHelp();
                }
                break;
                default: {
                    System.out.println("Incorrect command");
                    printHelp();
                }
            }
        }

        System.out.println("The program has been finished");


    }

    private static void printHelp() {
        System.out.println("*****************************************************");
        System.out.println("*           Address book v.0.0.1                    *");
        System.out.println("*****************************************************");
        System.out.println("* Supported commands:                               *");
        System.out.println("* add                   - adds contact              *");
        System.out.println("* delete                - deletes contact           *");
        System.out.println("* search by name        - searches by first name    *");
        System.out.println("* search by last name   - searches by last name     *");
        System.out.println("* search by phone       - searches by phone         *");
        System.out.println("* show all              - displays all contacts     *");
        System.out.println("* exit                  - quits program             *");
        System.out.println("*****************************************************");
    }

}

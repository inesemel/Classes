package composition.phonebook;

import javax.swing.*;
import java.util.ArrayList;

public class AddressBook {


    private ArrayList<Contact> contacts = new ArrayList<>();

    public String addContact() {
        String firstName = JOptionPane.showInputDialog("Enter the first name: ");
        String secondName = JOptionPane.showInputDialog("Enter the second name: ");
        String phoneNumber = JOptionPane.showInputDialog("Enter phone number: ");
        String additionalInfo = JOptionPane.showInputDialog("Some additional information ");

        Contact contact = new Contact(firstName, secondName, phoneNumber, additionalInfo);
        this.contacts.add(contact);
        return contact + " added successfully";
    }


    String allContacts() {
        String listOfContacts = "";
        for (int i = 0; i < contacts.size(); i++) {
            Object current = contacts.get(i);
            listOfContacts = listOfContacts + current.toString() + '\n';
        }
        return listOfContacts;
    }

    String searchContact() {
        String a = "";
        return a;
    }

}

package composition.phonebook;

import javax.swing.*;
import java.util.ArrayList;

public class AddressBook {


    private ArrayList<Contact> contacts = new ArrayList<>();

    public String addContact() {
        String firstName = JOptionPane.showInputDialog("Enter the first name: ");
        String secondName = JOptionPane.showInputDialog("Enter the second name: ");
        String phoneNumber = JOptionPane.showInputDialog("Enter the phone number: ");
        String additionalInfo = JOptionPane.showInputDialog("Some additional information ");

        Contact contact = new Contact(firstName, secondName, phoneNumber, additionalInfo);
        this.contacts.add(contact);
        return contact.getFirstName() + " added successfully";
    }


    ArrayList<Contact> allContacts() {
        return contacts;
    }


}

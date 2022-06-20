package composition.phonebook;

import javax.swing.*;
import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {

        AddressBook book1 = new AddressBook();
        String rez = book1.addContact();
        String rez2 = book1.addContact();
        JOptionPane.showMessageDialog(null,rez);
        JOptionPane.showMessageDialog(null,rez2);
        String con = book1.allContacts();
        CreateFile.create();
        CreateFile.writeFile(con);
        CreateFile.readFile();
        System.out.println(con);
        JOptionPane.showMessageDialog(null, con);

    }


}

package composition;

import composition.petExample.Owner;
import composition.petExample.Pet;
import composition.shop.Shop;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        Shop miniMart = new Shop();

        String result = miniMart.addProduct();

        JOptionPane.showMessageDialog(null, result);
        JOptionPane.showMessageDialog(null, miniMart.addProduct());

        result = miniMart.sellProduct();

        JOptionPane.showMessageDialog(null, result);
        JOptionPane.showMessageDialog(null, miniMart.sellProduct());




//        Pet pet = new Pet ("Muris", 10);
//        Owner owner = new Owner("Inese", "Salaspils", pet);
//        System.out.println(owner.sayHello());
//        System.out.println(owner.walkPet());
//        System.out.println(owner.walkPet());
//        System.out.println(owner.walkPet());
//        System.out.println(owner.feedPet());
//        System.out.println(owner.walkPet());
//        System.out.println(owner.walkPet());
//        System.out.println(owner.feedPet());
//        System.out.println(owner.feedPet());
//        System.out.println(owner.feedPet());
//        System.out.println(owner.walkPet());
    }
}

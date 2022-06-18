package composition.shop;

import javax.swing.*;
import java.util.ArrayList;

public class Shop {

    private ArrayList<Product> products = new ArrayList<>();
    private ArrayList<Customer> customers = new ArrayList<>();

    public String addProduct() {

        String name = JOptionPane.showInputDialog("Enter name of a product");
        double price = Double.parseDouble(JOptionPane.showInputDialog("Enter price of a product"));
        double quantity = Double.parseDouble(JOptionPane.showInputDialog("Enter quantity of a product"));

        String[] availableMeasurement =  {"KG", "Item", "MB", "Liters"};
        String measurement = (String) JOptionPane.showInputDialog(
                null,
                "Select product measurement",
                "Product Measurement",
                JOptionPane.QUESTION_MESSAGE,
                null,
                availableMeasurement,
                availableMeasurement[0]
        );

        Product product = new Product(name, price, quantity, measurement);

        this.products.add(product);
        return product + " added successfully";
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public String sellProduct() {
        Product productToSell = (Product) JOptionPane.showInputDialog(
                null,
                "Select product to by",
                "Buy product",
                JOptionPane.QUESTION_MESSAGE,
                null,
                this.products.toArray(),
                this.products.toArray()[0]
        );
        return "You successfully purchased product: " + productToSell;
    }


}

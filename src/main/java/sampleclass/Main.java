package sampleclass;

import sampleclass.produktSamples.Electronic;
import sampleclass.produktSamples.Food;
import sampleclass.produktSamples.Product;

import java.util.Date;

public class Main {
    public static void main(String[] args) {


        Product rice = new Product();
        Product bread = new Product("Sweet Bread");
        Product chocolate = new Product("Rimi Choco", 30, 5);
        Product phone = new Product("Samsung latest", 1399, 12, 10.50D,2.5F);

        System.out.println(rice);
        System.out.println(bread.name);
        System.out.println(phone);

        Product television = new Electronic("Samsung TV", 3404, 34, 2.6, "24 inches");
        Electronic laptop = new Electronic("HP Latest", 3245, 5, 4.5, "12 inches");
//        Electronic sample = (Electronic) new Product("HP Latest", 3245, 5);
        System.out.println(television);
        System.out.println(laptop);

        Food food = new Food("Chocolate", 23, 45, 10d, 2f, new Date());
        System.out.println(food);

        System.out.println(food.getDiscount());
        System.out.println(television.getDiscount());
        System.out.println(laptop.getDiscount());
        System.out.println(rice.getDiscount());
        System.out.println(bread.getDiscount());
        // OBJECT ORIENTED PROGRAMMING

        /*
        * Animals
            * Birds
                *Eagle
                * Chicken
                    * Hen
                    * Chick
            *Reptiles
                * Snakes
        *
        * */


    }

}

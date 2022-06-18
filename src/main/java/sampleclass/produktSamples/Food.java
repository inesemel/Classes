package sampleclass.produktSamples;

import java.util.Date;

public class Food extends Product{
    public Date expiryDate;

    public Food(String name, Integer price, int quantity, double discount, float weight, Date expiryDate) {
        super(name, price, quantity, discount, weight);
        this.expiryDate = expiryDate;
    }

    @Override
    public String getDiscount() {
        return "discount for this food will be " + (price/100);
    }

    @Override
    public String toString() {
        return super.toString() + ", " +
                "expiryDate=" + expiryDate;
    }
}

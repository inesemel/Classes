package sampleclass.animals;

public class Eagle extends Birds {

    private String color;
    public Eagle(String name, String canFly, int numberOfLegs, float weight, String color) {
        super(name, canFly, numberOfLegs, weight);
        this.color = color;
    }
}

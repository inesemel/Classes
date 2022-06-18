package sampleclass.animals;

public class Birds extends Animals {

    private double wingSize;

    public Birds(String name, String canFly, int numberOfLegs, float weight) {
        super(name, canFly, numberOfLegs, weight);
        this.wingSize = wingSize;
    }



}

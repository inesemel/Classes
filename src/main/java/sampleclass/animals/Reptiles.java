package sampleclass.animals;

public class Reptiles extends Animals {

    private int lifeSpan;

    public Reptiles(String name, String canFly, int numberOfLegs, float weight, int lifeSpan) {
        super(name, canFly, numberOfLegs, weight);
        this.lifeSpan = lifeSpan;
    }
}

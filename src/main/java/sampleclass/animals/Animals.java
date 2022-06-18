package sampleclass.animals;

public class Animals {
    public String name;
    public String canFly;
    public int numberOfLegs;
    private float weight;

    public Animals() {
        System.out.println("Animal created without values");
    }

    public Animals(String name, String canFly, int numberOfLegs, float weight) {
        this.name = name;
        this.canFly = canFly;
        this.numberOfLegs = numberOfLegs;
        this.weight = weight;
        System.out.println("Animal created with all values");

    }

    public String getName() {
        return name;
    }

    public String getCanFly() {
        return canFly;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public float getWeight() {
        return weight;
    }
}

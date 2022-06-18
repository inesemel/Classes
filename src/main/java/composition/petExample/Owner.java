package composition.petExample;

public class Owner {

    public String name;
    private String location;
    private Pet pet;

    public Owner(String name, String location, Pet pet) {
        this.name = name;
        this.location = location;
        this.pet = pet;

    }

    public String feedPet() {
        this.pet.setHungerLevel(pet.getHungerLevel() - 1);
        return this.pet.getName() + "'s hunger level reduced! " +
                "New level: " + this.pet.getHungerLevel();
    }

    public String walkPet() {
        this.pet.setHungerLevel(this.pet.getHungerLevel() + 1);
        return this.pet.getName() +
                " Walked 50 metres!, hunger level: " +
                this.pet.getHungerLevel();
    }

    public String sayHello() {
        return "Hello!, my name is " + this.name +
                " and my pet name is " +
                this.pet.getName();
    }




}

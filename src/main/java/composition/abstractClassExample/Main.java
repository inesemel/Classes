package composition.abstractClassExample;

import composition.abstractClassExample.humans.Adult;
import composition.abstractClassExample.humans.Baby;
import composition.abstractClassExample.humans.Human;
import composition.abstractClassExample.humans.Teen;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) {

        Baby baby = new Baby("Linda", 1);

        System.out.println(baby.move());
        System.out.println(baby.goTo("Market"));
        System.out.println(baby.goTo("Sleep"));

        System.out.println(baby.getName());
        try {
            baby.grow(2,4);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(baby.getAge());


        Teen teen = new Teen("Will", 15, "Hardcore");


        try {
            System.out.println(teen.move());
            teen.grow(5,6);
            System.out.println(teen.move());
            teen.grow(5,6);
            System.out.println(teen.move());
            teen.grow(5,6);
        } catch (Exception e) {
            System.out.println(e);;
        }

        System.out.println(teen.getAge());

        System.out.println(teen.goTo("kitchen"));
        System.out.println(teen.goTo("school"));
        System.out.println(teen.goTo("party"));

        Adult adult = new Adult("Julian", 68);

        System.out.println(adult.move());
        try {
            adult.grow(2,2);
            adult.grow(2,2);
            adult.grow(2,2);
            adult.grow(6,2);
            adult.grow(6,2);
            adult.grow(6,2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println(adult.move());


        ArrayList<Human> humans = new ArrayList<>();
        humans.add(adult);
        humans.add(teen);
        humans.add(baby);
        System.out.println("Using same method for different implementation");
        humans.forEach(human -> System.out.println(human.move()));
    }
}

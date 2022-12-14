package Zoo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> animal = new ArrayList<>();
        animal.add("Penguin");
        animal.add("Hippo");
        animal.add("Elephant");

        Zoo zoo = new Zoo(animal);
        System.out.println(zoo.seeAnimals());

        zoo.addAnimal("Lion");
        zoo.addNameAnimal("Lion", " Alex");
        zoo.deleteAnimal("Elephant");

        System.out.println(zoo);
    }
}
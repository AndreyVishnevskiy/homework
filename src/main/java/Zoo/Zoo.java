package Zoo;

import java.util.ArrayList;

public class Zoo {
    private ArrayList <String> zoo;

    Zoo(ArrayList<String> zoo){
        this.zoo = zoo;
    }

    void addAnimal(String animal){
        zoo.add(animal);
    }
    void deleteAnimal(String animal){
        zoo.remove(animal);
    }

    void addNameAnimal(String animal, String name){
        zoo.forEach(element -> {
            if (element.equals(animal)){
                zoo.set(zoo.indexOf(element), element + name);
            }
        });
//        for (int i = 0; i < zoo.size(); i++) {
//            if (zoo.get(i).equals(animal)){
//                zoo.set(i, zoo.get(i) + name);
//            }
//        }
//        for (String animal2: zoo) {
//            if (animal2.equals(animal)){
//                zoo.set(zoo.indexOf(animal2), animal2 + name);
//            }
//        }
    }

    @Override
    public String toString() {
        return zoo.toString();
    }

    public ArrayList <String> seeAnimals(){
        return zoo;
    }
}
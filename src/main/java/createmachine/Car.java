package createmachine;

public class Car extends Machine{
    public Car(String color, String door){
        super.color = color;
        super.door = door;
    }

    @Override
    public void sound() {
        System.out.println("Врум-врум" + "\n");
    }

    @Override
    public String toString() {
        return "дверей - " + door + ", колір - " + color + ", Вагу - " + weight;
    }
}

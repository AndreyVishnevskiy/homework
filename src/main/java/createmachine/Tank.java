package createmachine;

public class Tank extends Machine{

    public Tank(String color) {
        super.color = color;
    }

    public Tank(String color, String door) {
        super.color = color;
        super.door = door;
    }

    public Tank(String door, int weight) {
        super.door = door;
        super.weight = weight;
    }

    @Override
    public void sound() {
        System.out.println("Бах-бах");
    }

    @Override
    public String toString() {
        return "дверей - " + door + ", колір - " + color + ", Вагу - " + weight;
    }
}

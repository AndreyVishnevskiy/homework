package createmachine;

public class Machine {
    private String door;
    private String color;
    private String weight;

    public Machine() {
        door = "3е";
        color = "Білий";
        weight = "9т";
    }

    public void setDoor(String door) {
        this.door = door;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "дверей - " + door + ", колір - " + color + ", Вагу - " + weight;
    }
}
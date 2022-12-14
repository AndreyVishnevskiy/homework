package createmachine;

public class Truck extends Machine{
    public Truck(){

    }

    @Override
    public void sound() {
        System.out.println("Дир-дир" + "\n");
    }

    @Override
    public String toString() {
        return "дверей - " + door + ", колір - " + color + ", Вагу - " + weight;
    }
}

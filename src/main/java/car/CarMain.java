package car;

public class CarMain {
    public static void main(String[] args) {
        Car Ford = new Car();
        Car Toyota = new Car(2015);
        Car BMW = new Car(2018, "black");
        Car Mercedes = new Car(2020, 220, "grey");
        Car Audi = new Car(2021, 244, 1770, "rad");
    }
}
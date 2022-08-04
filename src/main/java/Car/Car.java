package Car;

public class Car {
    private int year;
    private double speed;
    private int weight;
    private String color;

    Car(){}

    Car(int year){
        this.year = year;
    }
    Car(int year, String color){
        this.year = year;
        this.color = color;
    }
    Car(int year, double speed, String color){
        this.year = year;
        this.speed = speed;
        this.color = color;
    }
    Car(int year, double speed, int weight, String color){
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }
}
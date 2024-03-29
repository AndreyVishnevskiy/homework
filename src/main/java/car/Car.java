package car;

public class Car {
    private int year;
    private double speed;
    private int weight;
    private String color;

    public Car(){}

    public Car(int year){
        this.year = year;
    }
    public Car(int year, String color){
        this.year = year;
        this.color = color;
    }
    public Car(int year, double speed, String color){
        this.year = year;
        this.speed = speed;
        this.color = color;
    }
    public Car(int year, double speed, int weight, String color){
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }
}
package Rectangle;

public class Rectangle {
    private double side1;
    private double side2;

    Rectangle(double side1, double side2){
        this.side1 = side1;
        this.side2 = side2;
    }

    public double areaCalculator(){
        return side1 * side2;
    }

    public double perimeterCalculator(){
        return 2 * (side1 + side2);
    }
}
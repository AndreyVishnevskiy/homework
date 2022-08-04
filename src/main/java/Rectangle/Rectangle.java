package Rectangle;

public class Rectangle {
    private static double side1;
    private static double side2;

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public static double areaCalculator(){
        return side1 * side2;
    }

    public static double perimeterCalculator(){
        return 2 * (side1 + side2);
    }
}
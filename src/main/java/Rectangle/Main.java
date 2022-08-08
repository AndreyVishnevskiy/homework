package Rectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число 1: ");
        double a = sc.nextDouble();
        System.out.print("Введите число 2: ");
        double b = sc.nextDouble();

        Rectangle Rectangle = new Rectangle(a, b);

        System.out.println("Площадь прямоугольника = " + Rectangle.areaCalculator());
        System.out.println("Периметр прямоугольника = " + Rectangle.perimeterCalculator());
    }
}
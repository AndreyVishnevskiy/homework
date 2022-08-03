package areaofcircle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Введите радиус круга: ");
        Scanner scan = new Scanner(System.in);
        double r = scan.nextDouble();
        System.out.println("S = " + MyArea.areaOfCircle(r));
    }
}

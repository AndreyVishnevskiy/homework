import java.util.Scanner;

public class Calculator {
    static double addition(double a, double b){
        return a + b;
    }

    static double subtraction(double a, double b){
        return a - b;
    }

    static double multiplication(double a, double b){
        return a * b;
    }

    static double division(double a, double b){
        return a / b;
    }

    public static double calculator(double a, double b, String symbol) {
        double result = 0;
        switch (symbol) {
            case "+":
                result = addition(a, b);
                break;
            case "-":
                result = subtraction(a, b);
                break;
            case "*":
                result = multiplication(a, b);
                break;
            case "/":
                result = division(a, b);
                break;
            default:
//                validationSymbol(symbol);
                break;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число a: ");
        double a = sc.nextDouble();
        System.out.print("Введите число b: ");
        double b = sc.nextDouble();
        System.out.print("Выберете опирацию (+, -, *, /): ");
        String symbol = sc.next();

        System.out.println(a + " " + symbol + " " + b + " = " + calculator(a, b, symbol));
    }
//    static String validationNumber(int a){
//        if (a = )
//    }

//    static void validationSymbol(String symbol){
//        if (symbol != "+" || symbol == "-" || symbol == "*" || symbol == "/")
//            break;
//        else
//            System.out.print("Выберете опирацию (+, -, *, /): ");
//    }
}

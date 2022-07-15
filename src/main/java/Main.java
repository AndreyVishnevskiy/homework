import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String symbol;
        String plus = "+";

        for (; ;){

        }


        do {
            System.out.print("Выберете опирацию (+, -, *, /): ");
            symbol = sc.next();
        } while (symbol.equals(plus));

        System.out.println("Вышли");
    }

}

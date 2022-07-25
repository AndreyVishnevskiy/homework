import java.util.Scanner;

public class NumbersCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = scan.nextInt();
        if (positiveNumber(n) == true)
            primeNumber(n);
    }

    static boolean positiveNumber (int n) {
        boolean status;
        if (n > 0) {
            System.out.println("Число положительное");
            status = true;
        } else {
            System.out.println("Число отрицательное");
            status = false;
        }
        return status;
    }

    static void primeNumber (int n) {
        int i = 2;
        int j = 0;
        while (i * i <= n && j != 1) {
            if (n % i == 0)
                j = 1;
            i++;
        }
        String answer = (j == 1) ? "Число составное" : "Число простое";
        System.out.println(answer);
    }
}
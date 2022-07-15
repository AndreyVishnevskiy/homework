import java.util.Scanner;

public class Fibonacci {
    static int fibonacci(int n){
        int a = 0;
        int b = 1;
        int result = 0;
        for (int i = 1; i < n; i++) {
            result = a + b;
            b = a;
            a = result;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = sc.nextInt();
        System.out.println(n + "-е число Фибоначче = " + fibonacci(n));
    }
}

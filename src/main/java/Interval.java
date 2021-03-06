import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число (0 - 100): ");
        int n = sc.nextInt();
        System.out.println(checkInterval(n));
    }

    static String checkInterval(int n) {
        if (n >= 0 && n <= 14) {
            return "Вы попали в промежуток [0 - 14]";
        }
        else if (n >= 15 && n <= 35){
            return "Вы попали в промежуток [15 - 35]";
        }
        else if (n >= 36 && n <= 50){
            return "Вы попали в промежуток [36 - 50]";
        }
        else if (n >= 51 && n <= 100){
            return "Вы попали в промежуток [51 - 100]";
        }
        else
            return "Вы не попали ни в один из имеющихся числовых промежутков";
    }
}

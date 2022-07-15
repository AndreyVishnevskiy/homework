import java.util.Scanner;

public class CheckIntegrityNumber {
    public static void main(String[] args) {
        System.out.print("Введите число: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println(oddEvenNumber(number));
    }
    public static String oddEvenNumber (int numberVariable){
        String answer = (numberVariable % 2 == 0) ? "Это четное число" : "Это нечетное число";
        return answer;
    }
}

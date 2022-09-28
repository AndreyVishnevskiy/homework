import java.util.Arrays;
import java.util.Scanner;

public class CustomerArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = scan.nextInt();
        int[] arr = arrayRandom(n);
        System.out.println("Сгенерированый масив: " + Arrays.toString(arr));
        System.out.println("Максимальное значение масива: " + maximumArrayValue(arr));
        System.out.println("Минимальное значение масива: " + minimumArrayValue(arr));
        System.out.println("Сума всех элементов масива: " + sumArray(arr));
        System.out.println("Среднее арифметическое всех элементов масива: " + averageArray(arr));
        oddValues(arr);
    }

    static int[] arrayRandom(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random()* 10);
        }
        return arr;
    }
    static int maximumArrayValue(int[] arr){
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max)
                max = arr[i];
        }
        return max;
    }
    static int minimumArrayValue(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(min > arr[i])
                min = arr[i];
        }
        return min;
    }
    static int sumArray(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    static double averageArray(int[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }
    static void oddValues(int[] arr) {
        System.out.print("Все нечетные значения масива: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1){
                int odd = arr[i];
                System.out.print(odd + " ");
            }
        }
    }
}
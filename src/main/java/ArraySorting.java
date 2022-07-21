import java.util.Arrays;
import java.util.Scanner;

public class ArraySorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Длина масива: ");
        int n = sc.nextInt();
        int[] arr = arrayRandom(n);
        System.out.println("Сгенерированый масив: " + Arrays.toString(arr));
        System.out.print("Выберете тип сортировки(Bubble, Selection): ");
        String type = sc.next();
        System.out.println("2е самое большое число масива - " + sortSelection(arr, type));
    }

    static int[] arrayRandom(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random()* 100);
        }
        return arr;
    }

    static int bubbleSort(int[] arr) {
        boolean status = true;
        int tmp;
        int i = 0;
        while (status) {
            status = false;
            for (i = 0; i < arr.length-1; i++) {
                if (arr[i] > arr[i+1]){
                    tmp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = tmp;
                    status = true;
                }
            }
        }
        System.out.println("Отсортерованый масив Bubble Sort: " + Arrays.toString(arr));
        return arr[i-1];
    }

    static int selectionSort(int[] arr) {
        int tmp;
        int i = 0;
        for (i = 0; i < arr.length-1; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++)
                if (arr[j] < arr[min])
                    min = j;
                    tmp = arr[min];
                    arr[min] = arr[i];
                    arr[i] = tmp;
        }
        System.out.println("Отсортерованый масив Selection Sort: " + Arrays.toString(arr));
        return arr[i-1];
    }

    static int sortSelection(int[] arr, String type) {
        int result = 0;
        switch (type) {
            case "Bubble":
                result = bubbleSort(arr);
                break;
            case "Selection":
                result = selectionSort(arr);
                break;
            default:
                System.out.println("Ошибка");
        }
        return result;
    }
}
import java.util.Arrays;
import java.util.Scanner;

public class ArraySorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Длина масива: ");
        int n = sc.nextInt();
        int[] arr = arrayRandom(n);
        System.out.println("Сгенерированый масив: " + Arrays.toString(arr));
        System.out.println("Выберете тип сортировки: \n 1 - Bubble Sort \n 2 - Selection Sort" );
        int type = sc.nextInt();
        System.out.println(sortSelection(n, arr, type));
    }

    static int[] arrayRandom(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random()* 10);
        }
        return arr;
    }

    static int bubbleSort(int[] arr, int n) {
        boolean status = true;
        int tmp;
        while (status) {
            status = false;
            for (int i = 0; i < arr.length-1; i++) {
                if (arr[i] > arr[i+1]){
                    tmp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = tmp;
                    status = true;
                }
            }
        }
        System.out.println("Отсортерованый масив Bubble Sort: " + Arrays.toString(arr));
        int result = arr[n-2];
        return result;
    }

    static int selectionSort(int[] arr, int n) {
        int tmp;
        for (int i = 0; i < arr.length-1; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[min])
                    min = j;
                    tmp = arr[min];
                    arr[min] = arr[i];
                    arr[i] = tmp;
            }
        }
        System.out.println("Отсортерованый масив Selection Sort: " + Arrays.toString(arr));
        int result = arr[n-2];
        return result;
    }

    static int sortSelection(int n, int[] arr, int type) {
        int result = 0;
        switch (type) {
            case 1:
                result = bubbleSort(arr, n);
                break;
            case 2:
                result = selectionSort(arr, n);
                break;
            default:
                System.out.println("Ошибка");
        }
        return result;
    }
}
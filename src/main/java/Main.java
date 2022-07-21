import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Длина масива: ");
        int n = sc.nextInt();
        int[] arr = arrayRandom(n);
        System.out.println("Original Array:" + Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("Sorted Array:" + Arrays.toString(arr));
        System.out.println("2е самое большое число масива - " + selectionSort(arr));
    }

    static int[] arrayRandom(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
        return arr;
    }

    static int selectionSort(int arr[]) {
        int tmp;
        int max = 0;
        for (int i = 0; i < arr.length-1; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++)
                if (arr[j] < arr[min])
                    min = j;
                    tmp = arr[min];
                    arr[min] = arr[i];
                    arr[i] = tmp;
                    max = arr[i];
        }
        return arr[max];
    }
}
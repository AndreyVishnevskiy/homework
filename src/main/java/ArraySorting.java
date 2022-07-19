import java.util.Arrays;
import java.util.Scanner;

public class ArraySorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Длина масива: ");
        int n = sc.nextInt();
        int[] arr = arrayRandom(n);
        System.out.print(Arrays.toString(arr));

    }

    static int[] arrayRandom(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random()* 10);
        }

        return arr;
    }
}

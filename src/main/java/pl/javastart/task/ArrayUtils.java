package pl.javastart.task;

import java.util.Scanner;

public class ArrayUtils {
    public int[] createArray() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj rozmiar tablicy");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Podaj " + size + " liczb");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    private int sum = 0;

    public int sumPow(int[] array) {
        for (int row : array) {
            sum += (int) Math.pow(row, 2);
        }
        return sum;
    }
}
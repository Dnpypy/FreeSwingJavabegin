package home9.homework;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class lesson1 {
    public static void main(String[] args) {

        System.out.print("Введите размер массива: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        Integer[] arr = new Integer[size];

        System.out.println("Введите поочереди элементы массива (размер массива равен " + size + "):");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close(); // закрытие потока

        var sum = printSum(arr);
        System.out.println("--------------");
        System.out.println("Сумма: " + sum);

        System.out.println("Среднее значение: " + printAverage(arr, sum));

        Integer[] tmpArray = new Integer[size]; // массив для сортировки, чтобы не трогать первоначальный
        System.arraycopy(arr, 0, tmpArray, 0, size);

        System.out.println("Сортировка по возрастанию");
        Arrays.sort(tmpArray);
        print(tmpArray);
        System.out.println();

        System.out.println("Сортировка по убыванию: ");
        Arrays.sort(tmpArray, Collections.reverseOrder());
        print(tmpArray);
        System.out.println();

        System.out.print("Четные:");
        showEven(arr);
        System.out.println();

        System.out.print("Нечетные:");
        showOdd(arr);

        System.out.println();

        System.out.println("--------------");

    }


    private static void showEven(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

    private static void showOdd(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

    private static double printAverage(Integer[] arr, int sum) {
        return sum / arr.length;
    }

    private static int printSum(Integer[] arr) {
        var sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    private static void print(Object[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

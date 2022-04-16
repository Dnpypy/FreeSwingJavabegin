package home9.homework;

import java.util.Scanner;

//lesson3

public class Triangle {

    private static String symbol;
    private static String triangle[][];
    private static int size;

    private static void fillTriangleBySymbol(String symbol) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                triangle[i][j] = symbol;
            }
        }
    }

    public static void createPatternA() {
        // заполняем весь массив символом с левого края, со второго символа пробел начинается
        fillTriangleBySymbol(symbol);
        // потом заполняем необходимые ячейки пробелами
        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j < i; j++) {
                triangle[j][i] = " ";
            }
        }
    }

    public static void createPatternB() {
        // // заполняем весь массив пробелами
        fillTriangleBySymbol(" ");
        // потом заполняем необходимые ячейки символом с правого края уменьшая на 1
        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j < triangle.length - i; j++) {
                triangle[i][j] = symbol;
            }
        }
    }

    public static void createPatternC() {
        // заполняем весь массив символом
        fillTriangleBySymbol(symbol);
        // потом заполняем необходимые ячейки пробелами, с правого края пробелы без последнего символа уменьшая длину на - i - 1
        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j < triangle.length - i - 1; j++) {
                triangle[j][i] = " ";
            }
        }
    }

    public static void createPatternD() {
        // заполняем весь массив символами,
        fillTriangleBySymbol(symbol);
        // потом заполняем необходимые ячейки пробелами, убирая символ  с левого края пока j < i
        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j < i; j++) {
                triangle[i][j] = " "; //// как в паттерне А только i j поменялись местами
            }
        }
    }

    public static String getTriangle() {
        System.out.println();// печатаем пустую строку чтобы был отступ от слова Pattern
        String output = "";
        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j < triangle.length; j++) {
                output += triangle[i][j];
            }
            output += "\n";
        }
        return output; // конечный треугольник записывается в эту переменную
    }

    public static void main(String[] args) {

        // считываем количество элементов
        System.out.print("Введите количество элементов: ");
        Scanner s = new Scanner(System.in);
        int arrayLength = s.nextInt();

        System.out.println();

        // считываем символ
        System.out.print("Введите символ для отображения: ");
        String arraySymbol = s.next();

        symbol = arraySymbol;
        size = arrayLength;

        triangle = new String[arrayLength][arrayLength];

        System.out.println();

        createPatternA();
        System.out.println("Pattern A");
        System.out.println(getTriangle());

        createPatternB();
        System.out.println("Pattern B");
        System.out.println(getTriangle());

        createPatternC();
        System.out.println("Pattern C");
        System.out.println(getTriangle());

        createPatternD();
        System.out.println("Pattern D");
        System.out.println(getTriangle());
    }
}

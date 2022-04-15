package home9.demo.arrays;


import home9.objects.Human;

import java.util.Arrays;

public class TestArrays {

    public static void main(String[] args) {

        int[] numbers1 = new int[5]; // размерность массива равна 5
        System.out.println("пустой массив инициализируется значениями 0");
        print(numbers1); // пустой массив инициализируется значениями 0

        //доступ к элементу по индексу
        numbers1[3] = 5; // изменен 4 элемент массива, т.к. индексация с нуля
        System.out.println("изменен 4 элемент массива, т.к. индексация с нуля");
        print(numbers1);

        //numbers1[5] = 5; // при запуске выйдет ошибка java.lang.ArrayIndexOutBoundException
        // т.е. вышли за пределы массива

        //создание и добавление значений в одной строке
        Object[] object1 = new Object[]{"cola", 0.71, 3}; // этот массив может записывать любые значения, т.к. Object является самым верхним типом для всех других объектов
        Object[] object2 ={"cola", 0.71, 3, 'e', 34534}; // сокращенная запись без new Object[]

        int[] numbers2 = {79, 87, 94, 82, 67}; // сокращенная запись без int

        System.out.println("массивы объектов");
        print(object1);
        print(object2);

        //массив собственных объектов
        Human[] humans = new Human[4];
        humans[0] = new Human("name" , 25);
        humans[2] = new Human("name3" , 25);

        print(humans);

        //двумерный массив
        //одновременно создание и инициализация
        int[][] table1 = new int[][]{{1, 2, 3, 4, 5} ,{6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};
        System.out.println("перебор по элементам двумерного массива");
        print(table1);

        int[][] table2 = new int[2][3]; // 2 строки, 3 столбца
        table2[0][0] = 10;
        table2[1][1] = 14;
        table2[1][2] = 46;
        System.out.println();
        print(table2);
    }

    /**
     * метод статичный и закрытый
     * перебор всех значений элементов и вывод в консоль
     * @param mass массив
     */
    private static void print(int[] mass) {
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + " ");
        }
        System.out.println();
    }

    /**
     * перегруженный метод
     * Object является самым верхним типом для всех других объектов
     * @param mass можем передавать любой массив ссылочного типа
     */
    private static void print(Object[] mass) {
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + " ");
        }
        System.out.println();
    }

    /**
     * перегруженный метод
     * перебор по элементам двойного массива и вывод их ввиде таблицы
     * @param mass двойной массив
     */
    private static void print(int[][] mass){
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}

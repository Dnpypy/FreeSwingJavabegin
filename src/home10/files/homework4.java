package home10.files;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Реализовать пример кода для чтения из папки списка только текстовых файлов (с расширением *.txt)
 */
public class homework4 {
    public static void main(String[] args) {

        // в какой папке ищу
        File dir = new File("D:\\Test\\");

        // расширение которое передаю
        FilenameFilter filenameFilter = new CustomFileFilter("txt");

        System.out.println("Файлы с расширением *.txt: ");

        // list() имеет перегруженный метод в который передаем наше расширение
        // и проверяем удовлетворяет ли условие, если совпадает(accept()) то выводится файл
        for (String fileName: dir.list(filenameFilter)) {
            System.out.println(fileName);
        }
    }
}

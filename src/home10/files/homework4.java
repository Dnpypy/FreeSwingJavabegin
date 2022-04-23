package home10.files;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Реализовать пример кода для чтения из папки списка только текстовых файлов (с расширением *.txt)
 */
public class homework4 {
    public static void main(String[] args) {

        FileInputStream fis = null;
        int num = 0;

        try {
            fis = new FileInputStream("D:\\Test\\text.txt");
            while((num = fis.read()) != -1) {
                System.out.print((char) num);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

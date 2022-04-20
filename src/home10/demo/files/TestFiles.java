package home10.demo.files;

import home10.demo.exceptions.TestExceptions;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestFiles {

    public static void main(String[] args) {

        writeTextToFile();
        readTextFromFile();
        readBytesFromFile();
    }

    private static void readBytesFromFile() {
        System.out.println("чтение данных из файла по байтам");
        BufferedInputStream bufferedInputStream = null;
        byte[] buffer = new byte[10];
        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream("D:\\text.txt"));
            int readBytes;
            while ((readBytes = bufferedInputStream.read(buffer)) != -1) {
                String str = new String(buffer);
            }
        } catch (FileNotFoundException fex) {
            Logger.getLogger(TestExceptions.class.getName()).log(Level.SEVERE, null, fex);
        } catch (IOException ex) {
            Logger.getLogger(TestExceptions.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(TestExceptions.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    private static void readTextFromFile() {
        System.out.println("Чтение текстовых данных из файла строки с помощью FileReader и BufferReader");
        try {
            BufferedReader bufferReader = new BufferedReader(new FileReader("D:\\text.txt"));
            String str;
            while ((str = bufferReader.readLine()) != null) {
                System.out.println(str);
            }
            bufferReader.close();
        } catch (IOException ex) {
            Logger.getLogger(TestExceptions.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void writeTextToFile() {

        System.out.println("запись текста в файл");
        try {
            Writer writer = new FileWriter("D:\\text.txt");
            writer.write("test strings + \n");
            writer.write("test strings");
            writer.flush();
            writer.close();
        } catch (IOException ioException) {
            Logger.getLogger(TestExceptions.class.getName()).log(Level.SEVERE, null, ioException);
        }
    }
}

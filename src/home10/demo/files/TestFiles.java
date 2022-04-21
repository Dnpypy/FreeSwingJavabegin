package home10.demo.files;

import home5.gui.Calculator;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestFiles {

    public static void main(String[] args) {

        writeTextToFile();
        readTextFromFile();
        readBytesFromFile();
        workWithFileSystem();
    }

    private static void workWithFileSystem() {
        System.out.println("работа с файловой системой");
        try {
            File file = new File("D:\\test.txt");
            file.createNewFile();
            System.out.println("Создан файл + " + file.getName());
            System.out.println("it's file = " + file.isFile());
            System.out.println("it's dir = " + file.isDirectory());

            File dirFile = new File("D:\\Idea");

            for (String name : dirFile.list()) {
                System.out.println("FileName is Dir: " + name);
            }
        } catch (IOException e) {
            Logger.getLogger(Calculator.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    private static void readBytesFromFile() {

        System.out.println("чтение данных из файла по байтам");
        BufferedInputStream bufferedInputStream = null;
        byte[] buffer = new byte[10];
        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream("D:\\test.txt"));
            int readBytes;
            while ((readBytes = bufferedInputStream.read(buffer)) != -1) {
                String str = new String(buffer);
                System.out.println(str);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Calculator.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Calculator.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(Calculator.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private static void readTextFromFile() {

        System.out.println("Чтение текстовых данных из файла строки с помощью FileReader и BufferReader");
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\test.txt"));
            String str;
            while ((str = bufferedReader.readLine()) != null) {
                System.out.println(str);
            }
            bufferedReader.close();
        } catch (IOException ex) {
            Logger.getLogger(Calculator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void writeTextToFile() {
        System.out.println("Запись текста в файл");
        try {
            Writer file = new FileWriter("D:\\sedddd.txt");
            file.write("test strings1" + "\n");
            file.write("test strings2");
            file.flush();
            file.close();
        } catch (IOException ex) {
            Logger.getLogger(Calculator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

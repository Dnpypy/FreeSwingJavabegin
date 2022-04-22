package lesson10.demo.exceptions;

import home5.gui.Calculator;

import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestExceptions {
    public static void main(String[] args) {

//        RuntimeExceptions (без перехвата)

        //(ArithmeticExceptions by zero)
//        System.out.println(2/0);

        //NullPointerException
//        Object object = null;
//        object.toString();

        //ClassCastException
//        Object o = new Object();
//        Human human = (Human) o;

        //RuntimeExceptions (с перехватом)

        //callFileException(); // код находится в отдельном методе, чтобы показать стек вызовов

//        try {
//            UIManager.setLookAndFeel("test look and feel");//указан не существующий lookandfeel, чтобы возникла ошибка
//
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(Calculator.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            Logger.getLogger(Calculator.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            Logger.getLogger(Calculator.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (UnsupportedLookAndFeelException ex) {
//            Logger.getLogger(Calculator.class.getName()).log(Level.SEVERE, null, ex);
//        }

          // можно заменить множество catch на один, но так НЕ рекомендуется делать
          // т.к желательно выбрасывать точной тип исклчения
//        try {
//            UIManager.setLookAndFeel("test look and feel");//указан не существующий lookandfeel, чтобы возникла ошибка
//
//        } catch (Exception ex) {
//            ex.printStackTrace();
//           // Logger.getLogger(Calculator.class.getName()).log(Level.SEVERE, null, ex);
//        }


        // демонстрация throws
//        try {
//            callThrowsFileException();
//        } catch (IOException e) {
//            Logger.getLogger(Calculator.class.getName()).log(Level.SEVERE, null, e);
//        }

        //использование finally
        //useFinaly();
        //useFinaly2();

        //метод который выбрасывает исключение вручную, самостоятельно
        try {
            int check = ownThrowException();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    private static int ownThrowException() throws Exception{
        var a = 1;
        var b = 1;
        var c = a + b;

        throw new Exception("Own throw Exception" );
    }

    private static void useFinaly2() {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("D:\\test.txt");
            fileWriter.write("test string");
            fileWriter.flush();
            return;
        } catch (IOException e) {
            Logger.getLogger(Calculator.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                System.out.println("i'm finally");
                if (fileWriter != null) {
                    fileWriter.close();
                } else {

                }
            } catch (IOException e) {
                Logger.getLogger(Calculator.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }

    private static void useFinaly() {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("D:\\Test\\test.txt");
            fileWriter.write("test string");
            fileWriter.flush();
            return;
        } catch (IOException e) {
            Logger.getLogger(Calculator.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                System.out.println("i'm finally");
                if (fileWriter != null) {
                    fileWriter.close();
                } else {

                }
            } catch (IOException e) {
                Logger.getLogger(Calculator.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }

    private static void callThrowsFileException() throws IOException {
        File file = new File("D:\\fff\\dgd.txt");
        file.createNewFile();
    }

    private static void callFileException() {
        try {
            File file = new File("D:\\TEST\\test.txt");
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("error message = " + e.getMessage());
            Logger.getLogger(Calculator.class.getName()).log(Level.SEVERE, null, e);
            e.printStackTrace();
        }
    }
}

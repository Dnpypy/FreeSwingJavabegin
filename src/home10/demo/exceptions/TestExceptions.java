package home10.demo.exceptions;

import home10.objects.Human;
import home5.gui.Calculator;

import javax.swing.*;
import java.io.File;
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
        //....


        // демонстрация throws
        //....

        //использование finally
        //...

        //метод который выбрасывает исключение вручную, самостоятельно
        //......

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

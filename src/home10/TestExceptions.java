package home10;

import home5.gui.Calculator;
import lesson10.objects.Human;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TestExceptions {


    public static void main(String[] args) {


        //1.
        //        RuntimeExceptions (без перехвата)
        //(ArithmeticExceptions by zero)
        try {
            System.out.println(2 / 0);
        } catch (ArithmeticException e) {
            System.out.println("divide by zero");
        }

        //NullPointerException
        try {
            Object object = null;
            object.toString();
        } catch (NullPointerException e) {
            System.out.println("Object null");
        }

        //ClassCastException
        try {
            Object o = new Object();
            Human human = (Human) o;
        } catch (ClassCastException e) {
            System.out.println("ClassCastException");
        }

        //2.
        //(TrainingException by zero)
        try {
            System.out.println(divide(6 / 4));
        } catch (TrainingException e) {
            Logger.getLogger(Calculator.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    private static double divide(int a, int b) throws TrainingException{
        var c = a / b;
       throw new TrainingException("divide by zero");
    }

    private static class TrainingException extends ArithmeticException {
        public TrainingException(String divide_by_zero) {
        }
    }
}

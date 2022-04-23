package home10.exceptions;

import home5.gui.Calculator;

import java.util.logging.Level;
import java.util.logging.Logger;

public class homework1 {
    public static void main(String[] args) {

        //Первый вариант решения
        try{
            System.out.println(4/0);
        } catch (RuntimeException e) {
            Logger.getLogger(Calculator.class.getName()).log(Level.SEVERE, null, e);
        } catch (Error e) {
            Logger.getLogger(Calculator.class.getName()).log(Level.SEVERE, null, e);
        } catch (Exception e) {
            Logger.getLogger(Calculator.class.getName()).log(Level.SEVERE, null, e);
        }

        //Второй вариант решения
        try{
            System.out.println(4/0);
        } catch (Throwable e) {
            Logger.getLogger(Calculator.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}

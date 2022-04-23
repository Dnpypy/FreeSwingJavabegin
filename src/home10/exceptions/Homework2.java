package home10.exceptions;




import java.util.logging.Level;
import java.util.logging.Logger;

public class Homework2 {

    public static void main(String[] args) {

        try {
            System.out.println(divide(4 , 0));
        } catch (TrainingException e) {
            Logger.getLogger(TrainingException.class.getName()).log(Level.SEVERE, null, e);
        }

    }

    private static double divide(int a, int b) throws TrainingException{
        try {
            if (b == 0) throw new TrainingException("Argument can not be 0");

            return a / b;
        } catch (ArithmeticException e) {
            throw new TrainingException(e.getMessage());
        } catch (Exception e) {
            Logger.getLogger(Exception.class.getName()).log(Level.SEVERE, null, e);
        }
        return 0;
    }


}

class TrainingException extends Exception {
    public TrainingException() {
        super();
    }

    public TrainingException(String s) {
        super(s);
    }
}

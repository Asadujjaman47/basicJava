package exception.trycatch;

public class Main {
    public static void main(String[] args) {
        try {
            int divideByZero = 1 / 0;
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception => " + e.getMessage());
        }

        finally {
            System.out.println("This is finally block");
        }
    }
}

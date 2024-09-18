package exception.customException.ex2;

// class that uses custom exception MyCustomException
public class TestCustomException2 {
    // main method
    public static void main(String[] args) {
        try {
            // throw and object of user defined exception
            throw new MyCustomException();
        }
        catch (MyCustomException e) {
            System.out.println("Caught the exception");
            System.out.println(e.getMessage());
        }

        System.out.println("rest of the code...");
    }
}

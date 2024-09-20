package lambda_Expression.e.closures.lambd_expression;

public class ClosureExample {
    public static void main(String[] args) {

        int outerVariable = 10;

        // Use a lambda expression to access the outerVariable
        Runnable myRunnable = () -> {
            System.out.println("Lambda expression: " + outerVariable);
        };

        myRunnable.run();
    }
}

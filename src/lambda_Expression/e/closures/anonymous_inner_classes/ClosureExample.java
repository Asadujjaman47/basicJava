package lambda_Expression.e.closures.anonymous_inner_classes;

public class ClosureExample {
    public static void main(String[] args) {

        int outerVariable = 10;

        // Define an anonymous inner class
        Runnable myRunnable = new Runnable() {
            @Override
            public void run() {
                // Access the outerVariable
                System.out.println("Inner class: " + outerVariable);
            }
        };

        myRunnable.run();
    }
}

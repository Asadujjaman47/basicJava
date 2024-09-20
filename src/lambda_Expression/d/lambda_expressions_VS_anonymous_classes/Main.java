package lambda_Expression.d.lambda_expressions_VS_anonymous_classes;

public class Main {

    // Using a lambda expression
    static Runnable r1 = () -> System.out.println("Hello World with lambda!");

    // Using an anonymous class
    static Runnable r2 = new Runnable() {
        @Override
        public void run() {
            System.out.println("Hello world with anonymous class!");
        }
    };

    public static void main(String[] args) {
        r1.run();
        r2.run();
    }
}

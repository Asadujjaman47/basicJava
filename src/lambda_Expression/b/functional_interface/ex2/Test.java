package lambda_Expression.b.functional_interface.ex2;

public class Test {
    public static void main(String[] args) {

        int a = 5;

        // lambda expression to define the calculate method
        Square s = (int x) -> x * x;

        // parameter passed and return type must be
        // same as defined in the prototype
        int ans = s.calculate(a);
        System.out.println(ans);
    }
}

package lambda_Expression.a.multiple_parameter;

public class LambdaExpressionExample5 {
    public static void main(String[] args) {

        // Multiple parameter in lambda expression
        Addable ad1 = (a, b) -> (a + b);
        System.out.println(ad1.add(10, 20));

        // Multiple parameter with data type in lambda expression
        Addable ad2 = (a, b) -> (a + b);
        System.out.println(ad2.add(100, 200));
    }
}

package lambda_Expression.a.single_parameter;

public class LambdaExpressionExample4 {
    public static void main(String[] args) {

        //Lambda expression with single parameter
        Sayable s1 = (name) -> {
            return "Hello " + name;
        };
        System.out.println(s1.say("Asad"));

        // Omit function parentheses
        Sayable s2 = name -> {
            return  "Hello " + name;
        };
        System.out.println(s2.say("Java"));
    }
}

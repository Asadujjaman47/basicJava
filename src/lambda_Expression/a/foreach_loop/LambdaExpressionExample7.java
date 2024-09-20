package lambda_Expression.a.foreach_loop;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpressionExample7 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        list.forEach(
                (n) -> System.out.println(n)
        );
    }
}

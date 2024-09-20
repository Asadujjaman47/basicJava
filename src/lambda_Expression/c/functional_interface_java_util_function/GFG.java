package lambda_Expression.c.functional_interface_java_util_function;

import java.util.function.Function;

public class GFG {

    public static void main(String[] args) {

        // Function which takes in a number and
        // return half of it
        Function<Integer, Double> half = a -> a / 2.0;

        // Now treble the output of half function
        half = half.andThen(a -> 3 * a);

        // Applying the function to get the result
        // and printing  on console
        System.out.println(half.apply(2));
    }
}

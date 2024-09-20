package lambda_Expression.c.functional_interface_java_util_function;

// Java Program to illustrate addThen() method
// When NullPointerException occurs

import java.util.function.Function;

// Importing interface
public class GFG2 {
    public static void main(String[] args) {

        // Function which takes in a number and
        // return half of it
        Function<Integer, Double> half = a -> a / 2.0;

        // Try block to check for exceptions
        try {
            // Trying to pass null as parameter
            half = half.andThen(null);
        }

        // Caltch block to handle exception
        catch (Exception e) {

            // print statement
            System.out.println("Exception thrown "
                                + "while passing null: " + e);
        }
    }

}

package stream_api.a;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Stream_API {
    public static void main(String[] args) {

        // create a list of integers
        List<Integer> number = Arrays.asList(2, 3, 4, 5);

        // demonstration of map method
        List<Integer> square = number.stream()
                .map(x -> x * x)
                .collect(Collectors.toList());

        System.out.println(square);

        // create a list of String
        List<String> names = Arrays.asList(
                "Reflection", "Collection", "Stream");

        // demonstration of filter method
        List<String> result = names.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(result);

        // create a list of integers
        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 2);

        // collect method returns a set
        Set<Integer> squareSet = numbers.stream()
                .map(x -> x * x)
                .collect(Collectors.toSet());

        System.out.println(squareSet);

        // demonstration of forEach method
        number.stream()
                .map(x -> x * x)
                .forEach(y -> System.out.println(y));

        // demonstration of reducer method
        int even = number.stream()
                .filter(x -> x % 2 == 0)
                .reduce(0, (ans, i) -> ans + i);

        System.out.println(even);

    }
}

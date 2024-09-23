package collectors.c.partitioning_elements;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Partitioning_Elements {
    public static void main(String[] args) {

        // create an Integer stream
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Partitioning condition
        Predicate<Integer> predicate = num -> num <= 5;

        // Apply the partitioningBy to partition the stream of numbers into two halves
        Map<Boolean, List<Integer>> map = integerStream.collect(
                Collectors.partitioningBy(predicate)
        );

        // print the result
        System.out.println("Result of the partitionBy method - " + map);

    }
}

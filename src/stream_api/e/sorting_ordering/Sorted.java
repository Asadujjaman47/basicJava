package stream_api.e.sorting_ordering;

import java.util.Random;

public class Sorted {
    public static void main(String[] args) {
        Random random = new Random();

        random.ints().limit(10)
                .sorted()
                .forEach(System.out::println);
    }
}

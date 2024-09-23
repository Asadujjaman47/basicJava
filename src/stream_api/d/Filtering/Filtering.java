package stream_api.d.Filtering;

import java.util.Arrays;
import java.util.List;

public class Filtering {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");

        // get count of empty string
        long count = strings.stream()
                .filter(string -> string.isEmpty()).count();

        System.out.println(count);

    }
}

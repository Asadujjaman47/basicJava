package collectors.d.summarising;

import java.util.Arrays;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Summarising {
    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(23, 23, 8);
        System.out.println("Contents of the list - " + integerList);

        Stream<Integer> integerStream = integerList.stream();

        IntSummaryStatistics intSummaryStatistics = integerStream.collect(Collectors.summarizingInt(e -> e));

        System.out.println("Summery statistics of the stream - " + intSummaryStatistics);
    }
}

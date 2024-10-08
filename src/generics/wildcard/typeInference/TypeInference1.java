package generics.wildcard.typeInference;

import java.util.ArrayList;
import java.util.List;

public class TypeInference1 {
    public static void main(String[] args) {

        // In Java 6 and earlier
        List<Integer> list = new ArrayList<Integer>();
        list.add(12);
        for (Integer element : list) {
            System.out.println(element);
        }

        // In Java 7
        List<Integer> list2 = new ArrayList<>();
        list2.add(12);
        for (Integer element : list2) {
            System.out.println(element);
        }
    }
}

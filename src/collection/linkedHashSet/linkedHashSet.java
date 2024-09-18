package collection.linkedHashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class linkedHashSet {

    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("h1");
        linkedHashSet.add("h2");
        linkedHashSet.add("h3");
        linkedHashSet.add("h4");
        linkedHashSet.add("h1");
        linkedHashSet.add("h3");

        for (String s : linkedHashSet) {
            System.out.println(s);
        }
    }
}

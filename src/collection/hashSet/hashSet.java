package collection.hashSet;

import java.util.HashSet;

public class hashSet {

    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("h1");
        hashSet.add("h2");
        hashSet.add("h3");
        hashSet.add("h4");
        hashSet.add("h1");
        hashSet.add("h3");

        for (String s : hashSet) {
            System.out.println(s);
        }
    }
}

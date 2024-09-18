package collection.linkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class linkedHashMap {

    public static void main(String[] args) {

        LinkedHashMap<Integer, String> hm = new LinkedHashMap<>();
        hm.put(1, "apple");
        hm.put(2, "banana");
        hm.put(3, "orange");
        hm.put(4, "pear");

        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}

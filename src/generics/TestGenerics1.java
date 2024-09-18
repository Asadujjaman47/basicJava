package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class TestGenerics1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
//        list.add(32); // compile time error

        String s = list.get(1);
        System.out.println("element is: " + s);

        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}

package collection.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class arrayList {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("ax");
        list.add("bx");
        list.add("cx");
        list.add("dx");

        for (String str : list) {
            System.out.println(str);
        }
    }
}

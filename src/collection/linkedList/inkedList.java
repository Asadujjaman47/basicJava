package collection.linkedList;

import java.util.LinkedList;

public class inkedList {

    public static void main(String[] args) {
        LinkedList<String> al = new LinkedList<>();
        al.add("a");
        al.add("b");
        al.add("c");
        al.add("d");

        for (String s : al) {
            System.out.println(s);
        }
    }
}

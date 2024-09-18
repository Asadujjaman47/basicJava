package collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class queue {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("a");
        queue.add("b");
        queue.add("c");
        queue.add("d");

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}

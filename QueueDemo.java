import java.util.*;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        queue.add("Apple");
        queue.add("Banana");
        queue.add("Cherry");

        System.out.println("Queue elements: " + queue);
        System.out.println("Removed: " + queue.poll());
        System.out.println("Now Queue: " + queue);
    }
}

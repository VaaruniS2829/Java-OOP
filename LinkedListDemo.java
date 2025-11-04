import java.util.*;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> queue = new LinkedList<>();
        queue.add("Task 1");
        queue.add("Task 2");
        queue.add("Task 3");

        System.out.println("All tasks: " + queue);

        queue.removeFirst(); // remove head element
        System.out.println("After removing first: " + queue);
    }
}

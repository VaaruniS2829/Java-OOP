import java.util.ArrayList;
import java.util.Iterator;

public class IteratorWithArrayList {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> names = new ArrayList<>();

        // Add elements
        names.add("Vaaruni");
        names.add("Ananya");
        names.add("Rahul");
        names.add("Meera");

        // Get the iterator
        Iterator<String> itr = names.iterator();

        // Traverse using iterator
        System.out.println("List of names:");
        while (itr.hasNext()) {
            String name = itr.next();
            System.out.println(name);
        }
    }
}

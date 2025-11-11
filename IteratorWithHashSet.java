import java.util.HashSet;
import java.util.Iterator;

public class HashSetIteratorWithHashSet {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> fruits = new HashSet<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");

        // Get an iterator
        Iterator<String> itr = fruits.iterator();

        // Iterate through the set
        System.out.println("Fruits in the set:");
        while (itr.hasNext()) {
            String fruit = itr.next();
            System.out.println(fruit);
        }
    }
}

import java.util.HashSet;

public class SimpleHashSet {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> fruits = new HashSet<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Apple");  // duplicate, will not be added

        // Display elements
        System.out.println("Fruits in HashSet: " + fruits);

        // Check if element exists
        if (fruits.contains("Mango")) {
            System.out.println("Mango is in the set.");
        }

        // Remove an element
        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);

        // Display size
        System.out.println("Total fruits: " + fruits.size());
    }
}

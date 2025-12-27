class Singleton {

    // Step 1: Create a private static instance
    private static Singleton instance;

    // Step 2: Make constructor private
    private Singleton() {
        System.out.println("Singleton object created");
    }

    // Step 3: Public method to return the instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
public class Main {
    public static void main(String[] args) {

        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        // Checking if both references point to same object
        System.out.println(obj1 == obj2);
    }
}

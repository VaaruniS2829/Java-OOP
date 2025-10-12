class Student {
    int id;
    String name;

    // Constructor
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Override hashCode() method
    @Override
    public int hashCode() {
        return id; // using id as the hash code value
    }
}

public class OverridingHashCode {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Anjali");
        Student s2 = new Student(102, "Kavya");
        Student s3 = new Student(101, "Sushanth");

        System.out.println("s1 hashCode: " + s1.hashCode());
        System.out.println("s2 hashCode: " + s2.hashCode());
        System.out.println("s3 hashCode: " + s3.hashCode());
    }
}

class Student {
    private int id;
    private String name;

    // Constructor to initialize data
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

public class GettersOnly {
    public static void main(String[] args) {
        Student s = new Student(101, "Vaaruni S");

        // Accessing data using getters
        System.out.println("Student ID: " + s.getId());
        System.out.println("Student Name: " + s.getName());
    }
}

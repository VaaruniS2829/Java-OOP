import java.util.*;

// Step 1: Create a Student class
class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

// Step 2: Create a Comparator to compare Students by age
class AgeComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        // Ascending order by age
        return Integer.compare(s1.age, s2.age);
    }
}

// Step 3: Main class to test Comparator
public class ComparatorExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        // Adding sample data
        students.add(new Student("Aarav", 22));
        students.add(new Student("Diya", 20));
        students.add(new Student("Rohan", 25));

        // Sorting using Comparator
        Collections.sort(students, new AgeComparator());

        // Printing sorted list
        System.out.println("Students sorted by age:");
        for (Student s : students) {
            System.out.println(s.name + " - " + s.age);
        }
    }
}

//Calling a Method of the Same Class //

/*Normally, if one method wants to call another method in the same class,
 you can just write the method name.
But you can also use this to make it clear that you are calling your own method. */

class Student {
    String name;
    int age;

    // Constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method 1
    void display() {
        // Using 'this' to call another method of same class
        this.showDetails();   
    }

    // Method 2
    void showDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age : " + age);
    }
}

public class ThisKeywordExample2 {
    public static void main(String[] args) {
        // Creating object
        Student s1 = new Student("Vaaruni", 21);

        // Calling display() which internally calls showDetails() using 'this'
        s1.display();
    }
}

// Inside display(), we used this.showDetails().

// Here this means current object (s1).

// So it becomes s1.showDetails().

// Result → the method showDetails() is called and prints details.

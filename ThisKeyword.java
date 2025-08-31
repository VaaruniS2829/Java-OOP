// Referring instance variables (to avoid confusions)

/*  Problem:
When local variables (method/constructor parameters) have the same name as instance variables,
 Java gets confused.
So we use 'this' keyword  to tell Java we mean the instance variable of the object. */

class Student {
    String name;   // instance variable (belongs to object)
    int age;       // instance variable (belongs to object)

    // Constructor with parameters (local variables)
    Student(String name, int age) {
        // Here 'name' and 'age' refer to local variables (parameters)
        // 'this.name' and 'this.age' refer to instance variables
        this.name = name;  // store local 'name' into instance variable 'name'
        this.age = age;    // store local 'age' into instance variable 'age'
    }

    void display() {
        System.out.println("Student Name: " + this.name);
        System.out.println("Student Age : " + this.age);
    }
}

public class ThisKeyword{
    public static void main(String[] args) {
        // Creating object of Student
        Student s1 = new Student("Vaaruni", 21);
        
        // Calling display method
        s1.display();  
    }
}

//name (parameter) → local variable (inside constructor)

//this.name → instance variable (belongs to object)

//So when we say this.name = name; → it means:

//Assign local name to the object’s own name.

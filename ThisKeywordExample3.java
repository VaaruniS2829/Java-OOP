//Calling One Constructor from Another (Constructor Chaining)

/*Sometimes, you want one constructor to reuse the code of another constructor.
For this, you use this() to call another constructor in the same class.
 Important Rule: this() must be the first line in the constructor.*/

 class Employee {
    String name;
    int age;

    // 1) Default constructor
    Employee() {
        this("Unknown", 0);              // (A) call the parameterized constructor
        System.out.println("Default constructor finished");
    }

    // 2) Parameterized constructor
    Employee(String name, int age) {
        // (B) no explicit super() here → compiler inserts super()
        this.name = name;                // set instance variable
        this.age = age;
        System.out.println("Parameterized constructor finished");
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ThisKeywordExample3 {
    public static void main(String[] args) {
        Employee e1 = new Employee();         // call #1: default constructor
        e1.display();

        System.out.println("---");

        Employee e2 = new Employee("Vaaruni", 20); // call #2: parameterized constructor
        e2.display();
    }
}
 // output:
 /* 
Parameterized constructor finished
Default constructor finished
Name: Unknown, Age: 0
---
Parameterized constructor finished
Name: Vaaruni, Age: 20
*/  

//Explanation:

// what actually happens when you run new Employee() 

 /* 1 .Memory allocation & default initialization

Java allocates memory for the new Student object.

All fields are set to default values: name = null, age = 0.

2.Start executing the constructor called by new

You asked new Student() → the default constructor (Student()) is invoked.

3.First line of the default constructor is this("Unknown", 0);

Because the default constructor calls this(...), execution jumps into the parameterized constructor Student(String, int) before doing anything else in the default constructor body.

This is constructor chaining: one constructor reuses another.

4.Inside the parameterized constructor

Java checks the first line of the parameterized constructor; it has no explicit this(...), so the compiler automatically inserts a call to super() (the Object constructor). So the superclass constructor runs (for Object it does nothing visible).

Next, instance initializers and instance variable initializers (if any) would run here — (our class doesn’t have extra initializer blocks, so skip).

Then the parameterized constructor body runs:

this.name = name; assigns "Unknown" to the object’s name.

this.age = age; assigns 0 to age.

System.out.println("Parameterized ctor finished"); prints that line.

5.Return from parameterized constructor back to default constructor

After parameterized constructor completes, control returns to the default constructor at the point just after the this("Unknown", 0); call.

Now the default constructor continues executing its remaining statements: System.out.println("Default ctor finished"); prints that line.

6.Default constructor finishes — object is fully constructed

At this point the Student object has name = "Unknown" and age = 0.

Control returns to main, which then calls s1.display() and you see the Name: Unknown, Age: 0 line.

7.When new Student("Aarav", 22) is used

The parameterized constructor is called directly.

It implicitly calls super() first, then runs its body, sets fields (name = "Vaaruni", age = 20) and prints Parameterized ctor finished. */



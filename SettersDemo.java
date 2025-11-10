public class Student {
    // data members (variables)
    private String name;
    private int age;

    // setter method for name
    public void setName(String n) {
        name = n;
    }

    // setter method for age
    public void setAge(int a) {
        age = a;
    }


    // display method to print values
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

    // main method to run the program
class SettersDemo{
    public static void main(String[] args) {
        Student s1 = new Student(); // create object

        s1.setName("Vaaruni");
        s1.setAge(20);

        s1.display(); // prints name and age
    }
}

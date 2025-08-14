public class Student {
    String name;
    int marks;

    //Method to check pass/fail
    void checkResult() {
        if (marks >= 35) {
            //Conditional flow
            System.out.println(name + " passed.");
        } else {
            System.out.println(name + " failed.");
        }
    }

    // Method to display student details
    void displayDetails() {
        System.out.println("Name: " + name + ",Marks: " + marks);
    }


    public static void main(String[] args) {
        //Object creation
        Student s1 = new Student();
        Student s2 = new Student();

        // Setting attributes

        s1.name = "Kavya";
        s1.marks = 50;
        s2.name = "Anjali";
        s2.marks = 30;

        //Calling methods (control flow moves here)

        s1.displayDetails();
        //  sequential flow

        s1.checkResult();
        //  conditional flow inside method

        s2.displayDetails();
        s2.checkResult();

    }
}

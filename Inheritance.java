// Inheritance
/*Inheritance is OOP (Object Oriented Programming) concept
 where one class (called child or subclass) can use the properties
 and methods of another class (called the parent or superclass).

 It allows code reusability and avoids writing the same logic again.
*/


class Vehicle {
    void start(){
    System.out.println("This vehicle starts.");
    }
}
class Car extends Vehicle{
    void drive(){
        System.out.println("The car is being driven.");
    }
}
public class Inheritance {
public static void main(String[] args){
 Car myCar = new Car();
 myCar.start();
 myCar.drive();
}
}

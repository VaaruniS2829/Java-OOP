abstract class Car // abstract class

{

 public abstract void drive(); // abstract method

 public void playMusic()

 {

    System.out.println("play music");

 }
 
}
 
class WagenR extends Car

{

 public void drive()

 {

     System.out.println("Driving..");

 }

}

public class Abstractkeyword
 
{

    public static void main(String[] args)
 
     {
        // Car obj = new Car();  Here , we cannot create object of class Car
        Car obj = new WagenR();

        obj.playMusic();

        obj.drive();

    }
 
}

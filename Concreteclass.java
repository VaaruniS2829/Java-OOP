abstract class Car // abstract class

{

 public abstract void drive(); // abstract method
  
 public abstract void flying();
 
 public void playMusic()

 {

    System.out.println("play music");

 }
 
}
 
abstract class WagenR extends Car

{

 public void drive()

 {

     System.out.println("Driving..");

 }

}

class UpdateWagenR extends WagenR // Concreteclass
{

    public void flying()

    {
     
        System.out.println("flying..");

    }

}

public class Concreteclass
{

    public static void main(String[] args)
     {
        // Car obj = new Car();  Here , we cannot create object of class Car
        Car obj = new UpdateWagenR();

        obj.playMusic();

        obj.drive();

        obj.flying();

    }
}

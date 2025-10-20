/*class - class - extends
class - interface - implements
interface - interface - extends*/

interface A
{
  int age = 20; // variables inside interface are by default final and static
  String area = "Mumbai";

  void show();
  void config();

}
interface X
{
  void run();
}
interface Y extends X
{
   
}


class B implements A,X
{
   public void show()
   {
    System.out.println("in show");
   }
   public void config()
   {
    System.out.println("in config");
   }
   public void run()
   {
    System.out.println("running..");  
   }
}

public class Interface
{
    public static void main(String[] args)
    {
        A obj;
        obj = new B();
        obj.show();
        obj.config();

        X obj1=new B();
        obj1.run(); 


System.out.println(A.area); // As area variable is by default static , here no need to access it via creating an object where it belongs 
   }
}

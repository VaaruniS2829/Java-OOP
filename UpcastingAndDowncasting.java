public void show1()
    {
        System.out.println("in A show");
    }
}
class B extends A
{
    public void show2()
    {
        System.out.println("in B show");
    }
}
public class UpcastingAndDowncasting
{
    public static void main(String[] args)
    {
        /*case 1:
       A obj = new A();
       obj.show1(); can be accessed
       obj.show2(); cannot be accessed and it will show you error
        */
      
       /*case 2:
         A obj = new B(); Creating object A with reference B
       obj.show1(); can be accessed
       obj.show2(); cannot be accessed
       */
       

       A obj =(A) new B(); //upcasting 
        obj.show1();
      //  obj.show2(); it will show error , inorder to access this it should be downcast
         
      B obj1=(B) obj; // Down casting
      obj1.show2(); 
      
      /*OR
       * ((B)obj).show2();
       */

    }
}

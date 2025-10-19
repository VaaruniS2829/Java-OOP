class A
{  
    int age;
    public void show()
    {
        System.out.println("in A show");
    }
    class B
    {
         public void config()
         {
            System.out.println("in config");
         }
    }
}
public class InnerClass
{
    public static void main(String[] args)
    {
       A obj = new A();
       obj.show();
     //  obj.config(); you can't access ,it will give error 
    
       A.B obj1=obj.new B(); // you can access members of B via object A
       obj1.config();

     //  A.B.obj1=new A.B(); this works only when class B is static

    }
}

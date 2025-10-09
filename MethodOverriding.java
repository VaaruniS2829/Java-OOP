// Method Overriding: Method overriding occurs when a subclass defines a method with the
// same name , return type , and parameters as a method in its superclass , but provides
// a different implementation.
class P
     {
    public void show()
      {
          System.out.println("in P show");
      }
      public void config()
      {
        System.out.println(" in Q config");
      }
  }
  class Q extends P
     {
        public void show() // this show method is overriding the show method of parent class
      {
          System.out.println("in Q show");
      }
   }
public class MethodOverriding
{
public static void main(String[] args){
    P obj = new P();
    obj.show();
}
}

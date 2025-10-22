class A_1
{
public void showTheDataWhichBelongsToThisClass()
   {
    System.out.println("in A show");
   }
}
class B_1 extends A_1
{
    @Override // annotation
public void showTheDataWhichBelongsToThisClass()
   {
    System.out.println("in B show");
   }
}
public class Annotation
{
    public static void main(String[] args)
    {
      B_1 obj = new B_1();
      obj.showTheDataWhichBelongsToThisClass();
    }
}

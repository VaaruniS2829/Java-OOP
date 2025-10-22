import java.lang.FunctionalInterface;// automatically imported

@FunctionalInterface
interface B
{
   public void show();
}
// class B implements A 
// {
//     public void show()
//     {
//         System.out.println("in show");
//     }
// }
public class TestFunctionalInterface
{
    public static void main(String[] args)
    {
       B obj = new B()
       {
         public void show()
        {
             System.out.println("in show");
        }
       };
       obj.show();
    }
}

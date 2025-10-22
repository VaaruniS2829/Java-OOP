import java.lang.FunctionalInterface;// automatically imported

@FunctionalInterface
interface B
{
   public void show(int i);
}
// class B implements A 
// {
//     public void show()
//     {
//         System.out.println("in show");
//     }
// }

   // lambda expression in Java is a short way to write anonymous functions (functions without a name).
//It’s mainly used to implement functional interfaces (interfaces with one abstract method).
public class Lambda_Expression
{
    public static void main(String[] args)
    {
       B obj = i->System.out.println("in show " + i);
       obj.show(5);
    }
}
// without lambda:
// B obj = new B() {
//     public void show() {
//         System.out.println("in show");
//     }
// };

//with lambda:
//B obj = () -> System.out.println("in show");


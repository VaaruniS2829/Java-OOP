// whenever you join a company the company provides you a pc.
interface  Computer
{
     void code();
}
class Laptop implements Computer
{
   public void code()
   {
      System.out.println( "code , compile , run");
   }
}
class Desktop implements Computer
{
   public void code()
   {
      System.out.println("code , compile , run : Faster");   
   }
}
class Developer// assume that you are a developer in that company
{
   public void devApp(Computer lap) //As a developer , you are developing an app
   {
      lap.code();
   }
}
public class ImportanceOfInterface
{
   public static void main(String[] args)
   {
    Computer lap = new Laptop();
    Computer desk = new Desktop();
    Developer employee = new Developer();
    employee.devApp(lap);
   //  employee.devApp(desk);
   }
}

// enum is a class , inside it we can create our own variables and constructors
enum Laptop 
{
   Macbook(2000) , XPS(2200) , Surface , ThinkPad(1800);// in dollars
   private int price;
   private Laptop() // default constructor 
   {
      price=500;
   }
   private Laptop(int price)// Parameterized constructor 
   {
      this.price=price;
      System.out.println("in Laptop " + this.name());
   }
    
   public int getPrice()
   {
      return price;
   }

   public void setPrice(int price)
   {
      this.price=price;
   }
}
public class EnumClass
{
   public static void main(String[] args)
    {
      //Laptop lap = Laptop.Macbook;
      //System.out.println(lap + ":" + lap.getPrice());
      for (Laptop lap:Laptop.values())
      {
         System.out.println(lap + ":" + lap.getPrice());
      }
    }
}

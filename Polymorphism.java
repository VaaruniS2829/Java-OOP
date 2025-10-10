class Q1
{
void show()
      {
         System.out.println("in P1 show");
      }
 }
 class Q1 extends P1
 {
     void show()
      {
         System.out.println("in Q1 show");
      }
 }
class R1 extends P1
{
     void show()
      {
         System.out.println("in R1 show");
      }
}
 
public class Polymorphism{
    public static void main(String[] args){
         P1 obj = new P1();
         obj.show();

         obj = new Q1();
         obj.show(); // it will call the show method of Q1 
                     // but still it of type A
         
         obj = new R1();
         obj.show(); // it will call the show method of R1 
                     // but still it of type A
                     
   // HENCE THIS IS DYNAMIC METHOD DISPATCH, THE METHOD SHOW() EXHIBITS MULTIPLE BEHAVIOUR
}
}

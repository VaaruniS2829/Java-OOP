class Calc
{
     int add(int n1 , int n2 )
    {
        return n1+n2;
    }
}
class AdvCalc extends Calc
{
      int add(int n1 , int n2 ) // the method add is overriding the method add present in class Calc
    {
        return n1+n2+1;
    }
}
class MethodOverridingExample
{
    public static void main(String[] args)
    {
      AdvCalc obj = new AdvCalc();
      int r1=obj.add(3 , 4);
      System.out.println(r1);
    }
} 

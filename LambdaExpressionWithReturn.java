import java.lang.FunctionalInterface;// automatically imported

@FunctionalInterface
interface A
{
   int add(int i , int j);
}
public class LambdaExpressionWithReturn
{
    public static void main(String[] args)
    {
    //    A obj = new A()
    //    {
    //     public int add(int i , int j)
    //     {
    //         return i+j;
    //     }
    //    };
    //    int result = obj.add(5,8);
    //    System.out.println(result); 
       A obj = (i,j)->i+j;
       
       int result = obj.add(5,8);
       System.out.println(result);    

    }
}

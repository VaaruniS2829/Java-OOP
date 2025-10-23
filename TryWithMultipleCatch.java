class TryWithMultipleCatch
{
  public static void main(String[] args)
 {
    int i = 2;
    int j = 0;

    int nums[] = new int[5];
    String str = null;
    // try will basically try to execute the program
    try 
    {
        j=18/i;
        System.out.println(str.length());
        System.out.println(nums[1]);
        System.out.println(nums[1]);
    }
    // if there is an exception , catch accepts it, and then catch block will executes
    catch(ArithmeticException e)
    {
        System.out.print("Cannot divide by zero");
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
        System.out.println("Stay in your limit");
    }
    catch(Exception e) // Exception is parent class, and it will handle all cases and it should be at bottom
    {
        System.out.println("Something Went Wrong");
    }
    
    System.out.println(j);
    System.out.println("Bye");
 }  
}

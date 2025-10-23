class ExceptionThrowKeyword
{
  public static void main(String[] args)
 {
    int i = 0; // you change i value and see different output
    int j = 0;
    try 
    {
        j=18/i;
        if(j==0)
           throw new ArithmeticException("I dont want to print zero");
      
    }
    // if there is an exception , catch accepts it, and then catch block will executes
    catch(ArithmeticException e)
    {
        j=18/1; // just handle the exception
        System.out.println("that's the default output");
    }
   
    catch(Exception e) // Exception is parent class, and it will handle all cases and it should be at bottom
    {
        System.out.println("Something Went Wrong");
    }
    
    System.out.println(j);
    System.out.println("Bye");
 }  
}

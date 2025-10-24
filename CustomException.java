class AnjaliException extends Exception
{
    public AnjaliException(String string)
    {
        super(string);
    }
}
class CustomException
{
  public static void main(String[] args)
 {
    int i = 20; // you change i value and see different output
    int j = 0;
    try 
    {
        j=18/i;
        if(j==0)
           throw new AnjaliException("I dont want to print zero");
      
    }
    // if there is an exception , catch accepts it, and then catch block will executes
    catch(AnjaliException e)
    {
        j=18/1; // just handle the exception
        System.out.println("that's the default output" + e);
    }
   
    catch(Exception e) // Exception is parent class, and it will handle all cases and it should be at bottom
    {
        System.out.println("Something Went Wrong..");
    }
    
    System.out.println(j);
    System.out.println("Bye");
 }  
}





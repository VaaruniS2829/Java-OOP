class ExceptionHandlingUsingTryCatch
{
  public static void main(String[] args)
 {
    int i = 0;
    int j = 0;
    // try will basically try to execute the program
    try 
    {
        j=18/i;
    }
    // if there is an exception , catch accepts it, and then catch block will executes
    catch(Exception e)
    {
        System.out.println("Something Went Wrong.......");
    }
    System.out.println(j);
    System.out.println("Bye");
 }  
}

enum Status
{
  Running , Pending , Failed , Success;
}
public class Enum
{
   public static void main(String[] args)
   {
    Status s = Status.Running;
    System.out.println(s);
    System.out.println(s.ordinal());
    //Status[] ss = Status.values(); it will give address
    /*for (Status s : ss )  it gives for all the values in the form of an array
    {   
        System.out.println(s+ ":" + s.ordinal());
   }*/
}
}

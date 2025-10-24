class Ab
{
    public void show() throws ClassNotFoundException
    {
        // try{
            Class.forName("Edit");
        // }
        // catch(ClassNotFoundException e)
        // {
        //     System.out.println("Not able to find the class");
        // }
    }
}
class DuckingExceptionUsingThrows
{
    
    static {
        System.out.println("Class Loaded");
    }
    public static void main(String[] args)
    {
       Ab obj = new Ab();
       try {
       obj.show();
       }
       catch(ClassNotFoundException e) 
       {
        e.printStackTrace();
       }
    }
}

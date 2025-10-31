//Runnable is an interface in Java that is used to define a task that can be executed by a thread.
class A implements Runnable{ 
    public void run()
    {
        for(int i=1 ; i<=10;i++)
        {
            System.out.println("hi");
            try{
            Thread.sleep(10); // asking to wait for 10 milli seconds and continue
        }
        catch(InterruptedException e){
         e.printStackTrace();
        }
    }

    }
}
class B implements Runnable{
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println("hello");
             try{
            Thread.sleep(10); // asking to wait for 10 milli seconds and continue
        }
        catch(InterruptedException e){
         e.printStackTrace();
        }
        }
    }
}
public class RunnableInterface{
    public static void main(String[] args) {
        Runnable obj1=new A(); // Thread 1
        Runnable obj2=new B(); //Thread 2
        
        //obj1.start();  // it will not work because it is run method is not there in runnable
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
        
        //obj2.start();  // starts thread B
    }
}

class Counter {
    int count;
   public synchronized void increment(){
      count++;
    }
}

public class RaceConditions{
    public static void main(String[] args) throws InterruptedException{
        Counter c = new Counter();
        Runnable obj1=() ->{
        for(int i=1 ; i<=10;i++)
        {
            c.increment();
        }
        };

         
        Runnable obj2=()->{
            for(int i=1;i<=10;i++)
        {
            c.increment();
        }
        }; 
        //Runnable dont have thread methods , so we have to create thread obj
        //obj1.start();  // it will not work because it is run method is not there in runnable
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
          System.out.println(c.count);
    }
}

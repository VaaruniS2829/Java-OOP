
/*In Java, a thread is a small unit of a process that runs independently.

By default, every Java program runs on a single thread called the main thread.

But you can create multiple threads to perform tasks simultaneously (concurrently).

When a class extends Thread, it inherits all the features of a thread and becomes

 capable of running independently.

 Every thread in Java begins its execution from the run() method.

 The start() method creates a new thread in memory and then automatically calls the run() method in that new thread.

This is different from calling run() directly —

if you call obj1.run(), it will run in the main thread (not a new one).

Once both start() calls execute:

Thread A begins running run() → prints "hi".

Thread B begins running run() → prints "hello".

Now both threads are executing simultaneously.

Each time you run the program, the order may change because:

The Java scheduler decides which thread runs first.

The CPU time given to each thread may vary.*/
class A extends Thread{ // extending thread class
    public void run()
    {
        for(int i=1 ; i<=10;i++)
        {
            System.out.println("hi");
        }
    }
}
class B extends Thread{
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println("hello");
        }
    }
}
public class MultipleThread{
    public static void main(String[] args) {
        A obj1=new A(); // Thread 1
        B obj2=new B(); //Thread 2
        obj1.start();  // starts thread A
        obj2.start();  // starts thread B
    }
}

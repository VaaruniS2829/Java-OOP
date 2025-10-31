/*Only one thread (main thread) runs this code.

It prints numbers from 1 to 5 — one after another in order */
public class Threads {
    public static void main(String[] args) {
        System.out.println("Program starts");
        
        for(int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
        }
        
        System.out.println("Program ends");
    }
}

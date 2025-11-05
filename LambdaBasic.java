interface Sayable {
    void say();
}

public class Example1 {
    public static void main(String[] args) {
        Sayable s = () -> System.out.println("Hello from Lambda!");
        s.say();
    }
}

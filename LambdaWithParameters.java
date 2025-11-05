interface Addable {
    int add(int a, int b);
}

public class LambdaWithParameters {
    public static void main(String[] args) {
        Addable add = (a, b) -> a + b;
        System.out.println("Sum: " + add.add(5, 7));
    }
}

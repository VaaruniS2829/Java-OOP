interface Square {
    int findSquare(int n);
}

public class LambdaWithOneInput {
    public static void main(String[] args) {
        Square s = (n) -> n * n;
        System.out.println("Square = " + s.findSquare(5));
    }
}

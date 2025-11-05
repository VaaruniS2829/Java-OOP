// without lamda                                              
// interface Hello {
//     void sayHello();
// }

// public class Test {
//     public static void main(String[] args) {
//         Hello h = new Hello() {
//             public void sayHello() {
//                 System.out.println("Hello!");
//             }
//         };
//         h.sayHello();
//     }
// }
// with lamda:
interface Hello {
    void sayHello();
}

public class LambdaBasic {
    public static void main(String[] args) {
        Hello h = () -> System.out.println("Hello!");
        h.sayHello();
    }
}


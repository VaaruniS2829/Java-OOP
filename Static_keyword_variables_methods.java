public class StaticExamples {

    int a; // Declaring static variable
    static int b; // Declaring non-static variable
     
    static void method1(){

     // creating static method
    System.out.println("This is static method");

    }

    void method2(){

    // creating non-static method
     System.out.println("This is non-static method");

    }

    void method3(){

        a=120; 
        b=100; // static variable can be accessed through non-static method

        method1(); 
        method2(); // static method can be accessed through non-static method

    }
    public static void main(){

        //  There is no need to create objects , since it is static stuff
        b=100;
        System.out.println(b);
        method1();

        // A non-static stuff cannot be accessed through static
        // need to create objects , because it is static stuff
        StaticExamples obj = new StaticExamples();
        obj.a=120;
        System.out.println(obj.a);
        obj.method2();

    }
}

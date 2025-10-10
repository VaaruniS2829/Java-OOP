/*Compile Time Polymorphismn or Static Polymorphism
: Acheived via Method Overloading
 * why compiletime?
 * because , control checks at compile time that which method it should run
 */
class CompileTimePolymorphism{
    int sum(int a , int b){
        return a + b;
    }
    int sum(int a , int b ,int c){
        return a+b+c;
    }
public static void main(String[] args){
    CompileTimePolymorphism obj = new CompileTimePolymorphism();
    // Call the 2-parameter sum and print the result
        System.out.println("Sum of 2 numbers: " + obj.sum(2, 3));

        // Call the 3-parameter sum and print the result
        System.out.println("Sum of 3 numbers: " + obj.sum(1, 4, 8));
}
}

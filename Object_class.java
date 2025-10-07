 /*  Object class:
 * what is the super class for X?
 * ->Every class in java extends the Object class, even if you don't mention
*/

class X extends Object{ // super class
public X(int n){
super(); // Here , its calling the constructor of object class
     System.out.println("in X int");
    }
public X(){
  super();
    System.out.println("in X");
}
}
class Y extends X{ // sub class
public Y(int n){
    super(n);// control reads parametrized constructor of super class
     System.out.println("in Y int");
    }
public Y(){
    super(); 
     System.out.println("in Y");
}
}
public class Super_keyword{
    public static void main(String[] args) {
        Y obj1 = new Y(5);
    }
}

class X { // super class
public X(int n){
super(); // Here , its calling the constructor of object class
     System.out.println("in X int");
    }
public X(){
  super(); 
    System.out.println("in X");// (1)
}
}
class Y extends X{ // sub class
public Y(int n){
    this();// reads the default constructor of Y
     System.out.println("in Y int");// (3)
    }
public Y(){
    super(); //  default constructor executes in X
     System.out.println("in Y");// (2)
}
}
public class Super_And_this{
    public static void main(String[] args) {
        Y obj1 = new Y(5);
    }
}
/*Output:in X
in Y
in Y int
*/

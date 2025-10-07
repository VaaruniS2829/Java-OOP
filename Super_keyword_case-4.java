/*case 4: passing parameter to super();
 * then output is: in X int
 *                 in Y int
*/

class X{ // super class
public X(int n){
super();
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

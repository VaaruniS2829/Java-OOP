Super keyword:
  // case 1: ->when default constructor is called
//         ->Every constructor has method called super() by default 
class X{ // super class
public X(){
 // super(); by default, control reads super() method before reading print statement
System.out.println("in X");
}
}
class Y extends X{ // sub class
public Y(){
// super(); by default
System.out.println("in Y");
}
}
public class Super_keyword{
    public static void main(String[] args) {
        Y obj1 = new Y(); // this will calls the constructor of both X and Y
    }
}
// OUTPUT: in X
//         in Y

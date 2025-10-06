Case 2:
// case 2: suppose in Y and X if we create parametrized constructor 
// output will be in X , in Y; NOT in X int , in Y int
//Because , when we create an object for B , WE ARE NOT PASSING ANY ARGUMENTS
class X{ // super class
public X(int n){
     System.out.println("in X int");
    }
public X(){
 // super(); by default, control reads super() method before reading print statement
    System.out.println("in X");
}
}
class Y extends X{ // sub class
public Y(int n){
     System.out.println("in Y int");
    }
public Y(){
// super(); by default
     System.out.println("in Y");
}
}
public class Super_keyword{
    public static void main(String[] args) {
        Y obj1 = new Y();
    }
}

Case 3:
/*case 3: suppose in Y if we create parametrized constructor 
and pass argument when creating object then it will call the constructor which takes parameter
then output will be :
                in X 
                in y int 
                        */
class X{ // super class
/*public X(int n){
     System.out.println("in X int");
    }*/
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
        Y obj1 = new Y(5);
    }
}

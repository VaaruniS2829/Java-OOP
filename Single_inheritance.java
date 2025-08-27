// Single inheritance

// A class inherits from only one parent class.

class A {
    int a;
    int b;
    public void display(){
        System.out.println(a+b);
    }
}

class B  extends A{
    int x;
    int y;
    public void show(){
        System.out.println(x+y);
    }
}
public class Single_inheritance{
    public static void main(){
        B obj = new B();
        obj.a = 100;
        obj.b = 200;
        obj.x = 150;
        obj.y = 250;
        obj.display();
        obj.show();
    }
}

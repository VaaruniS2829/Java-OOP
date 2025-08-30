// Hierarchical_inheritance

/* Multiple child classes inherit from a single parent class. */
/* One super class can have many sub classes */

class A2 {
    int a;
    int b;
    public void display(){
        System.out.println(a+b);
    }
}

class B2 extends A2{
    int x;
    int y;
    public void show(){
        System.out.println(x+y);
    }
}

class C1 extends A2 {
    int p;
    int r;
    public void add(){
        System.out.println(p+r);
    }
    
}
public class Hierarchical_inheritance{
    public static void main(String args[]){
        B1 obj = new B1();
        obj.a = 100;
        obj.b = 200;
        obj.x = 150;
        obj.y = 250;
        obj.display();
        obj.show();
        C c = new C() ;
        c.p=5;
        c.r=10;
        c.a=20;
        c.b=30;
        c.add();
    }
}

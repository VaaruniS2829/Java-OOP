// Multilevel inheritance
/*A class is derived from another class ,
 which is derived from another class(a chain).*/

class A1 {
    int a;
    int b;
    public void display(){
        System.out.println(a+b);
    }
}

class B1 extends A1{
    int x;
    int y;
    public void show(){
        System.out.println(x+y);
    }
}

class C extends B1 {
    int p;
    int r;
    public void add(){
        System.out.println(p+r);
    }
    
}
public class Multilevel_inheritance{
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
        c.x=20;
        c.y=30;
        c.add();
        c.show();

    }
}

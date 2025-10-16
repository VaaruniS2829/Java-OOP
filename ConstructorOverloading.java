class ConstructorOverloading{

    int a;
    int b;

    //  Creating constructor without giving input
    ConstructorOverloading(){

        a=10;
        b=20;
        System.out.println(a+b);

    }
     
    //  Creating constructor by giving input
    ConstructorOverloading(int x , int y){

        int a=x;
        int b=y;
        System.out.println(a+b);

    }

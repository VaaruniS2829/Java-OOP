class MethodOverloading{

    int a;
    int b;

    void sum(){

        a=10;
        b=20;
        System.out.println(a+b);

    }

    void sum(int x , int y){

        int a=x;
        int b=y;
        System.out.println(a+b);

    }

    void sum(int x , int y , int z){

        System.out.println(x+y+z);

    }

    public static void main(String[] args){

        // Overloading methods with same name but different parameters
        MethodOverloading obj = new MethodOverloading();
        obj.sum();
        obj.sum(100 , 200);
        obj.sum(100 , 200 , 300);

    }
}

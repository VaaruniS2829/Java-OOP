public class Methods{

    int id;
    char name;
    
    void getValues(int i , char a){

        id=i;
        name=a;

    }

    void display(){

        System.out.println(id + " " +name);

    }

    public static void main(String[] args){

        Methods obj = new Methods();
        obj.getValues(10 , 'a');
        obj.display();

    }
}


class Laptop
{
    String model;
    int price;

    public String toString(){
        return model + " : " + price;
    }
    public boolean equals(Laptop that)
    {
        if(this.model.equals(that.model)&&this.price==that.price)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
 }
 class EqualsObjectMethod
{
    public static void main(String[] args)
    {
    Laptop obj1 = new Laptop();
    obj1.model =  "Lenovo";
    obj1.price = 50000;

     Laptop obj2 = new Laptop();
    obj2.model =  "Lenovo";
    obj2.price = 50000;

    boolean result = obj1.equals(obj2);

    System.out.println(result);
   }
}

/*hashCode() method:
In Java, the hashCode () method is a method that is defined in the Object class, 
which is the parent class of all classes in Java. It returns an integer value that 
represents the unique hash code of an object.*/

class Laptop
{
    String model;
    int price;

//     public String toString(){
//         return model + " : " + price;
//     }
 }
 class HashCodeMethod
{
    public static void main(String[] args)
    {
    Laptop obj = new Laptop();
    obj.model =  "Lenovo";
    obj.price = 50000;

    System.out.println(obj); // This is called the default toString() output
    // behind the scene it will call tostring method
    // even if you don't mention
    //System.out.println(obj.toString());  calling tostring method of myclass
}
}
// When you see something like Laptop@251a69d7, it’s a custom object printed using its default toString().

// The part after @ is the hash code in hexadecimal, which comes from the object’s memory address.

// When you see something like hashCode of name1: 1965736641, it’s a String object.

// The String class overrides hashCode() and calculates a number based on the characters in the string.

// That’s why different strings give different numbers, and the same string always gives the same hash code.

// The main difference: default hashCode is memory-based (for custom objects), while String hashCode is content-based.

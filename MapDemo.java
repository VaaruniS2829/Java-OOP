/*In Java, a Map is an interface in the java.util package that represents a collection of key–value pairs.
It maps unique keys to specific values, meaning each key can be used to retrieve its associated value quickly.
HashMap → Unordered, fast performance
LinkedHashMap → Maintains insertion order
TreeMap → Maintains keys in sorted order
Hashtable → Thread-safe but slower (legacy class)*/
import java.util.Map;
import java.util.HashMap;

public class MapDemo 
{
    // Map is a collection of key and pair.
    // it itself is an interface
    public static void main(String[] args)
    {
        Map<String , Integer>students= new HashMap<>();
        students.put("Kavya", 18);
        students.put("Anjali", 19);
        students.put("Sushanth" ,21);
        students.put("Sushanth" ,25);// the key cannot be repeated and values can be repeated
        System.out.println(students.keySet());
        for(String key: students.keySet())
        {
            System.out.println(key +" : " + students.get(key));
        }
    }
}

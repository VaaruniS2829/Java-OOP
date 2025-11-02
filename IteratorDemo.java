import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Collection;
import java.util.Iterator;
public class IteratorDemo{
    public static void main(String[] args) {
        Collection<Integer>nums = new TreeSet<Integer>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        //for Sets (and any Collection without indexes), you need:
        Iterator<Integer>values=nums.iterator();
        while(values.hasNext())
        System.out.println(values.next());

        // for(int n :nums)
        // {
        //     System.out.println(n);
        // }
    }
}
/*Iterator:Used to go through elements one by one
hasNext():Checks if another element exists
next():	Returns the next element */

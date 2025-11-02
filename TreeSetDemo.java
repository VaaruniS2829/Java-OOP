import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
public class TreeSetDemo{
    public static void main(String[] args) {
        Set<Integer>nums = new TreeSet<Integer>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);// Tree set gives sorted elements
        for(int n :nums)
        {
            
            System.out.println(n);
        }
    }
}

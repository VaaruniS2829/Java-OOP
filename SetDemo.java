import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
public class SetDemo{
    public static void main(String[] args) {
        Set<Integer>nums = new HashSet<Integer>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);// set will not get u sorted elements
        for(int n :nums)
        {
            
            System.out.println(n);
        }
    }
}

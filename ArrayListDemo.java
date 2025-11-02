import java.util.List;
import java.util.ArrayList;
public class ArrayListDemo{
    public static void main(String[] args) {
        List<Integer>nums = new ArrayList<Integer>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        System.out.println(nums.get(2));
        System.out.println(nums.indexOf(30));


        // Collection nums = new ArrayList();
        // for(Object n = num)
        // {
        //     int num = (Integer)n;
        //     System.out.println(nums+2);
        // }
    }
}

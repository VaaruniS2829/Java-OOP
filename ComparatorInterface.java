import java.util.*;
import java.util.List;
class ComparatorInterface{
   static Comparator<Integer> com = new Comparator<Integer>() {
        public int compare(Integer i , Integer j)
        {
            if(i%10 > j%10)
              return 1;
            else
               return -1;
        }
    };
public static void main(String[] args) {
List<Integer> nums = new ArrayList<>();
nums.add(21);
nums.add(17);
nums.add(54);
nums.add(83);
Collections.sort(nums, com);
System.out.println(nums);
}
}

import java.util.*;
public class array_list {
    public static void main(String[] args) {
        int arr[]=new int[5];
        ArrayList<Integer> al=new ArrayList<>();
        al.add(7);
        al.add(8);
        al.add(9);
        Collections.sort(al, (Integer a , Integer b)->b-a);

//        int compare(Integer a , Integer b){
//            return b-a;
//        }
        for(int i:al) {
            System.out.println(i);
       }

    }
}

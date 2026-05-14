import java.util.LinkedList;

public class Linked_List {
    public static void main(String[] args) {
        LinkedList<Integer>list=new LinkedList<>();
        list.add(8);
        list.add(9);
        list.add(10);
        list.addFirst(5);
        list.addLast(40);
        for(int i:list){
            System.out.println(i);
        }
    }
}

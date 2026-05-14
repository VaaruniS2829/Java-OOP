import java.util.LinkedList;
import java.util.Queue;

public class CollectionQueue {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();// queue has the property of both linked list and queue
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.poll();
        q.peek();
        q.offer(9);
        boolean r=q.isEmpty();
        System.out.println(r);
        for(int i:q){
            System.out.println(i);
        }
    }
}

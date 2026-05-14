import java.util.Stack;

public class Collection_Stack {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.pop();

        System.out.println(stack);
//        for(int i=0;i<stack.size();i++){
//            System.out.println(i);
//        }
for(int i:stack){
    System.out.println(i);
}
    }
}

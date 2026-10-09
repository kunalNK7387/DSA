package CollectionFramework;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackBasic {
    public static void main() {
        Deque<Integer> stack=new ArrayDeque<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack);
    }
}

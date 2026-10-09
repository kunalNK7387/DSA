package CollectionFramework;
import java.util.LinkedList;
import java.util.Queue;

public class QueueBasic {

    public static void main(String[] args){
        Queue<Integer> q =new LinkedList<>();
        q.offer(10); // in add we need to handele the error by useing exception handling instid of this we use offer
        q.offer(20);
        q.offer(30);
        q.offer(40);
        q.offer(50);


    }
}

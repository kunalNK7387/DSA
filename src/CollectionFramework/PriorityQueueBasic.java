package CollectionFramework;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueBasic {
    static void main(String[] args) {
        Queue<Integer> pq=new PriorityQueue<>();
        //default behaviour -> Integer -> less value -> high Priority

        pq.offer(40);
        pq.offer(30);
        pq.offer(20);
        pq.offer(10);

        System.out.println(pq.poll());


    }
}

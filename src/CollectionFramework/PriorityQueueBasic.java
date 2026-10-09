package CollectionFramework;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueBasic {
    static void main(String[] args) {
        Queue<Integer> pq=new PriorityQueue<>();
        //default behaviour -> Integer -> less value -> high Priority->minHeap

        //maxHeap ->Integer -> High Value -> high Priority

        //pq -> String -> Comparator

        pq.offer(40);
        pq.offer(30);
        pq.offer(20);
        pq.offer(10);

        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);

    }
}

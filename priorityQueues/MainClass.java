package priorityQueues;

import java.util.PriorityQueue;

public class MainClass {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.offer("Kiwi");
        pq.offer("Apple");
        pq.offer("Mango");
        pq.offer("Banana");
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
    }
}

package myQueue;

import java.util.*;
import java.util.*;

public class MainClass {
    public static void main(String[] args) {
//        Queue<Integer> q = new LinkedList<>();
//        q.add(12);
//        q.add(23);
//
//        System.out.println(q);
//        System.out.println(q.remove());
//        System.out.println(q.remove());
        MyQueue<Integer> mq = new MyQueue<>();
        mq.enqueue(12);
        mq.enqueue(13);
        mq.enqueue(5);

        System.out.println(mq.peek());
        System.out.println(mq.dequeue());
        System.out.println(mq.peek());
    }


}

package linkedlist;

import java.util.*;

public class MainLinkedList {
    public static void main(String[] args) {
        MyLinkedList myLL = new MyLinkedList();
        myLL.add(12);
        myLL.add(13);
//        myLL.print();
    }

    static void getTimeDiff(List<Integer> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            list.add(0, i);
        }
        long end = System.currentTimeMillis();
        System.out.println(list.getClass().getName() + " --> " + (end - start));
    }
}

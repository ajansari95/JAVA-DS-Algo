package deque;

public class MyDeque<E> {
//    head, tail(next, prev);
    Node<E> head, tail;
    public void addToHead(E data){
        Node<E> toAdd = new Node<>(data);
        if(head==null){
            head = tail = toAdd;
            return;
        }
        head.next = toAdd;
        toAdd.prev =  head;
        head = toAdd;

    }
    public E removeLast(){
        Node<E> toRemove = tail;
        tail = tail.next;
        tail.prev =null;
        toRemove.next = null;
        return toRemove.data;

    }

    public static class Node<E>{
        E data;
        Node<E> next;
        Node<E> prev;
        public Node(E data){
            this.data = data;
            this.next = this.prev = null;
        }

    }
}

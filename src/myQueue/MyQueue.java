package myQueue;

import linkedlist.MyLinkedList.Node;
public class MyQueue<E> {

//two pointers h,r
//    pop() dequeue()
//    push() enqueue()
//    add at front reove at rear
    private Node<E> head,rear;

    public void enqueue(E e) {
        Node<E> toAdd = new Node<>(e);
        if(head == null){
            head = rear = toAdd;
            return;
        }
     rear.next= toAdd;
     rear = rear.next;
    }
    public E dequeue() {
        if(head==null){
            return null;
        }
        Node<E> temp = head;
        head = head.next;
        if(head==null){
            rear = null;
        }
        return temp.data;
    }
    public E peek(){
        if(head == null){
            return null;
        }
        return head.data;
    }


}



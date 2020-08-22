package ch03queue;

import ch04linklist.SingleLinkedList;

public class LinkedListQueue<E> implements Queue<E> {

    private class Node {
        public E e;
        public Node next;

        public Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }

        public Node(E e) {
            this(e, null);
        }

        public Node() {
            this(null, null);
        }

        @Override
        public String toString() {
            return e.toString();
        }
    }


    private Node head, tail;
    private int size;

    public LinkedListQueue(){
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public void enqueue(E e) {
        if(tail == null) {
            tail = new Node(e);
            head = tail;
        } else {
            tail.next = new Node(e);
            tail = tail.next;
        }
        size ++;
    }

    @Override
    public E dequeue() {
        if(head == null){
            throw new IllegalArgumentException("Cannot dequeue from an empty queue.");
        }
        Node ret = head;
        head = head.next;
        ret.next = null;
        if(head == null)
            tail = null;
        size -- ;
        return ret.e;
    }

    @Override
    public E getFront() {
        return head.e;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0 ;
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        Node cur = head;
        res.append("LinkedListQueue: front ]");
        while(cur != null){
            res.append(cur.e + "->");
            cur = cur.next;
        }
        res.append("NULL tail");
        return res.toString();
    }
}

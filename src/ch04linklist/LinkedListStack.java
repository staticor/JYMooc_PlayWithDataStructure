package ch04linklist;

import ch03stack.Stack;

public class LinkedListStack<E> implements Stack<E> {

    private SingleLinkedList<E> list;

    public LinkedListStack(){
        list = new SingleLinkedList<>();
    }

    @Override
    public void push(E e) {
        list.addFirst(e);
    }

    @Override
    public E pop() {
        return list.removeFirst();
    }

    @Override
    public E peek() {
        return list.getFirst();
    }

    @Override
    public int getSize() {
        return list.getSize();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append("Stack: top [ ");
        res.append(list);
        res.append(" ]");
        return res.toString();
    }
}

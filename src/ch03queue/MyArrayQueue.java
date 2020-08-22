package ch03queue;

import ch02array.MyArray;

public class MyArrayQueue<E> implements Queue<E> {

    MyArray<E> array;

    public MyArrayQueue(int capacity){
        array = new MyArray<>(capacity);
    }

    public MyArrayQueue(){
        this(10);
    }


    @Override
    public void enqueue(E e) {
        array.addLast(e);
    }

    @Override
    public E dequeue() {
        return array.removeFirst();
    }

    @Override
    public E getFront() {
        return array.getFirst();
    }

    @Override
    public int getSize() {
        return array.getSize();
    }

    public int getCapacity(){
        return array.getCapacity();
    }

    @Override
    public boolean isEmpty() {
        return false;
    }


    @Override
    public String toString(){
        StringBuilder ret = new StringBuilder("ArrayQueue: front [");
        for (int i = 0 ; i < array.getSize(); i ++) {
            ret.append(array.get(i));
            if (i != array.getSize() -1){
                ret.append(", ");
            }
        }
        ret.append("] tail");
        return ret.toString();
    }


    public static void main(String[] args) {
        MyArrayQueue<Integer> queue = new MyArrayQueue<>();
        for (int i = 0 ; i < 10 ; i ++){
            queue.enqueue(i);
            System.out.println(queue);

            if(i % 3 == 2){
                queue.dequeue();
                System.out.println(queue);
            }
        }
    }
}

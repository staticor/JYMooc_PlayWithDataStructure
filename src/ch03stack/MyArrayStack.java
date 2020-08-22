package ch03stack;

import ch02array.MyArray;
public class MyArrayStack<E>  implements  Stack<E> {

    MyArray<E> array;
    public MyArrayStack(int capacity){
        array = new MyArray<>(capacity);
    }

    public MyArrayStack(){
        this(10);
    }


    @Override
    public void push(E e) {
        array.addLast(e);
    }

    @Override
    public E pop() {
        return array.removeLast();
    }

    @Override
    public E peek() {
        return array.getLast();
    }

    @Override
    public int getSize() {
        return array.getSize();
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    public int getCapacity(){
        return array.getCapacity();
    }


    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append("Stack: [");
        for(int i = 0; i < array.getSize(); i ++){
            res.append(array.get(i));
            if(i != array.getSize()-1)
                res.append(", ");
        }
        res.append(" ] top");
        return res.toString();
    }
}

package ch04linklist;

public class LinkedListStackTest {

    public static void main(String[] args) {
        LinkedListStack<Integer> stack1 = new LinkedListStack();

        for(int i = 0 ; i < 5; i++){
            stack1.push(i);
            System.out.println(stack1);
        }

    }
}

package ch03queue;

public class LinkedListQueueTest {

    public static void main(String[] args) {
        LinkedListQueue<Integer> queue = new LinkedListQueue<>();

        for(int i = 0; i < 10; i ++){
            queue.enqueue(i);
            System.out.println(queue);
        }
    }
}

package ch03queue;

import java.util.Random;

/**
 * 对比 普通队列与循环队列的性能差异
 */
public class TwoQueueTest {

    // 测试使用q运行opCount个enqueue 和dequeue操作所需要的时间， 单位：秒
    private static double testQueue(Queue<Integer> q, int opCount){
        Random random = new Random();
        long startTime = System.nanoTime();

        for(int i = 0; i < opCount; i ++){
            q.enqueue(random.nextInt(Integer.MAX_VALUE));
        }
        for(int i = 0 ; i < opCount; i ++){
            q.dequeue();
        }

        long endTime = System.nanoTime();

        return (endTime - startTime)/ 1000000000.0;
    }

    public static void main(String[] args) {
        int opCount = 100000;

        Queue<Integer> arrayQueue = new MyArrayQueue<>();
        double time1 = testQueue(arrayQueue, opCount);

        Queue<Integer> loopQueue = new LoopQueue<>();
        double time2 = testQueue(loopQueue, opCount);

        LinkedListQueue<Integer> linkQueue = new LinkedListQueue<>();
        double time3 = testQueue(linkQueue, opCount);

        // 36.3 s   vs   0.014 s
        System.out.println("ArrayQueue, time:" + time1 + " s");
        System.out.println("LoopQueue, time:" + time2 + " s");
        System.out.println("LinkedQueue, time:" + time3 + " s");

    }
}

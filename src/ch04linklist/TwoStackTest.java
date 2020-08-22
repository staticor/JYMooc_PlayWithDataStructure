package ch04linklist;

import ch03stack.MyArrayStack;
import ch03stack.Stack;

import java.util.Random;

/**
 *  对比 数组栈和链表栈的性能差异
 */
public class TwoStackTest {


    // 测试使用q运行opCount个enqueue 和dequeue操作所需要的时间， 单位：秒
    private static double testStack(Stack<Integer> q, int opCount){
        Random random = new Random();
        long startTime = System.nanoTime();

        for(int i = 0; i < opCount; i ++){
            q.push(random.nextInt(Integer.MAX_VALUE));
        }
        for(int i = 0 ; i < opCount; i ++){
            q.pop();
        }

        long endTime = System.nanoTime();

        return (endTime - startTime)/ 1000000000.0;
    }

    public static void main(String[] args) {
        int opCount = 1000000;

        Stack<Integer> arraystack = new MyArrayStack<>();
        double time1 = testStack(arraystack, opCount);

        Stack<Integer> linkstack = new LinkedListStack<>();
        double time2 = testStack(linkstack, opCount);

        // 36.3 s   vs   0.014 s
        System.out.println("ArrayStack, time:" + time1 + " s");
        System.out.println("LinkedList Stack, time:" + time2 + " s");

    }
}

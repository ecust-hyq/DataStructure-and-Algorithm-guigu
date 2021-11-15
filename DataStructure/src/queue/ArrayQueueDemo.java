package queue;

/**
 * @auther hyq
 * @create 2021/11/12
 * @description 用数组模拟队列
 *
 * 队列遵循先进先出的原则，可以使用数组模拟也可以使用链表模拟，此程序使用数组模拟队列
 */
public class ArrayQueueDemo {
    public static void main(String[] args) {
        ArrayQueue myArrayQueue = new ArrayQueue(5);
        myArrayQueue.add(3);
        myArrayQueue.add(4);
        myArrayQueue.add(5);
        myArrayQueue.add(6);

        myArrayQueue.printQueue();
    }
}

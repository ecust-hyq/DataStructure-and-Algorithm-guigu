package queue;

/**
 * @author HYQ
 * @description
 * @creat 2021--11--13--10:19
 */
public class ArrayQueueTest {
    public static void main(String[] args) {
        ArrayQueue myArrayqueue = new ArrayQueue(5);
        myArrayqueue.add(3);
        myArrayqueue.add(4);
        myArrayqueue.add(5);
        myArrayqueue.add(6);

        myArrayqueue.printQueue();
        System.out.println();
        System.out.println("--------");

        System.out.println(myArrayqueue.get());
        System.out.println(myArrayqueue.get());
        System.out.println(myArrayqueue.get());
        System.out.println(myArrayqueue.get());
        System.out.println("--------");
        myArrayqueue.add(7);
        myArrayqueue.add(8);
        myArrayqueue.add(9);
        myArrayqueue.add(10);
        myArrayqueue.add(11);
        myArrayqueue.add(12);

        System.out.println(myArrayqueue.get());
        myArrayqueue.add(12);

        myArrayqueue.printQueue();
    }
}

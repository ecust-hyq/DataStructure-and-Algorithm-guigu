package queue;

/**
 * @author HYQ
 * @description 数组模拟队列，这里模拟队列的方式跟尚硅谷的有所不同，
 * 尚硅谷的模拟队列的方式是利用头尾两个指针对数组进行索引，元素的添加和取出并不改变元素在数组中的位置，但是队列只能使用一次，一次添加
 * 满之后便不能再添加，于是尚硅谷又提出一种循环列表的方式。理论上循环列表的方式时间复杂度比我的方法更低。
 * 我这里的模拟的队列添加元素会让所有元素向前移动一位，取出元素，头指针下移，模拟了队列先进后出的特性并且可反复添加去取出无限更新使用
 * @creat 2021--11--13--10:18
 */
public class ArrayQueue {
    private int maxSize;
    private int front = -1;
    private int rear = 0;
    private int[] arrayQueue;

    public ArrayQueue(int maxSize){
        this.maxSize = maxSize;
        arrayQueue = new int[this.maxSize];
    }

    public void add(int number){
        if(front >= maxSize-1){
            System.out.println("当前队列已满，请等待");
        }else {
            front++;
            for (int i = 0; i < front-rear; i++) {
                arrayQueue[front-i] = arrayQueue[front-i-1];
            }
            arrayQueue[rear] = number;
        }
    }

    public int get(){
        if(front < 0){
            throw new RuntimeException("当前队列为空，请添加数据");
        }else {
            return arrayQueue[front--];
        }
    }

    public void printQueue(){
        for (int i = 0; i < front-rear+1; i++) {
            System.out.print(arrayQueue[i] + "  ");
        }
    }
}
